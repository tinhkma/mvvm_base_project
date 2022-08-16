/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:32 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:32 AM
 *
 */

package com.tinhtx.base_app.ui.home.repository

import android.annotation.SuppressLint
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeRepository @Inject constructor(
    private val homeApiManager: HomeApiManager
) {

    private val _data = BehaviorSubject.create<String>()
    val data: Observable<String> = _data.hide()

    private val _error = BehaviorSubject.create<String>()
    val error: Observable<String> = _error.hide()

    @SuppressLint("CheckResult")
    fun getData() {
        homeApiManager.getData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onSuccess = {
                    _data.onNext(it.data)
                },
                onError = {
                    _error.onNext(it.message ?: "")
                }
            )
    }
}