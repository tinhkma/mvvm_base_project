/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:32 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:32 AM
 *
 */

package com.tinhtx.base_app.ui.home.repository

import android.annotation.SuppressLint
import com.google.gson.Gson
import com.tinhtx.base_app.ui.home.model.AssetsDataResponse
import com.tinhtx.base_app.ui.login.model.LoginResponse
import com.tinhtx.base_app.utils.LocalManager
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeRepository @Inject constructor(
    private val homeApiManager: HomeApiManager,
    private val localManager: LocalManager
) {

    private val _employeeData = BehaviorSubject.create<LoginResponse.EmployeeData?>()
    val employeeData: Observable<LoginResponse.EmployeeData?> = _employeeData.hide()

    private val _assetsDataResponse = BehaviorSubject.create<AssetsDataResponse?>()
    val assetsDataResponse: Observable<AssetsDataResponse?> = _assetsDataResponse.hide()

    private val _error = BehaviorSubject.create<String>()
    val error: Observable<String> = _error.hide()

    @SuppressLint("CheckResult")
    fun getAssetsData() {
        /*homeApiManager.getAssetsData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onSuccess = {
                    _assetsDataResponse.onNext(it)
                },
                onError = {
                    _error.onNext(it.message ?: "")
                }
            )*/
    }

    fun getEmployeeData() {
        val json = localManager.preferences.getString(LocalManager.LOGIN_RESPONSE_KEY)
        if (!json.isNullOrEmpty())
            _employeeData.onNext(Gson().fromJson(json, LoginResponse.EmployeeData::class.java))
    }
}