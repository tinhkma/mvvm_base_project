/*
 * *
 *  * Created by tinhtx on 7/6/23, 1:28 PM
 *  * Copyright (c) 2023 . All rights reserved.
 *  * Last modified 7/6/23, 1:27 PM
 *
 */

package com.tinhtx.base_app.ui.login.repository

import android.annotation.SuppressLint
import com.google.gson.Gson
import com.tinhtx.base_app.ui.login.model.LoginResponse
import com.tinhtx.base_app.utils.LocalManager
import com.tinhtx.base_app.utils.LocalManager.Companion.LOGIN_RESPONSE_KEY
import com.tinhtx.base_app.utils.LocalManager.Companion.PREFERENCE_KEY_TOKEN
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoginRepository @Inject constructor(
    private val homeApiManager: LoginApiManager,
    private val localManager: LocalManager
) {

    private val _data = BehaviorSubject.create<LoginResponse>()
    val data: Observable<LoginResponse> = _data.hide()

    private val _error = BehaviorSubject.create<String>()
    val error: Observable<String> = _error.hide()

    @SuppressLint("CheckResult")
    fun getData(bodyRequest: String) {
        homeApiManager.loginToHrm(bodyRequest).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()).subscribeBy(onSuccess = {
                saveData(it.employeeData)
                _data.onNext(it)
            }, onError = {
                _error.onNext(it.message ?: "")
            })
    }

    private fun saveData(employeeData: LoginResponse.EmployeeData) {
        localManager.preferences.setString(PREFERENCE_KEY_TOKEN, employeeData.token)
        localManager.preferences.setString(LOGIN_RESPONSE_KEY, Gson().toJson(employeeData))
    }
}