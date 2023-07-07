/*
 * *
 *  * Created by tinhtx on 7/6/23, 1:27 PM
 *  * Copyright (c) 2023 . All rights reserved.
 *  * Last modified 7/6/23, 1:27 PM
 *
 */

package com.tinhtx.base_app.ui.login

import androidx.lifecycle.LiveData
import com.google.gson.Gson
import com.tinhtx.base_app.base.BaseViewModel
import com.tinhtx.base_app.ui.login.model.LoginBodyRequest
import com.tinhtx.base_app.ui.login.model.LoginResponse
import com.tinhtx.base_app.ui.login.repository.LoginRepository
import com.tinhtx.base_app.utils.SingleLiveEvent
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    private val loginRepository: LoginRepository
) : BaseViewModel() {

    private val _onClick = SingleLiveEvent<Unit>()
    val onClick: LiveData<Unit> = _onClick

    private val _data = SingleLiveEvent<LoginResponse>()
    val data: LiveData<LoginResponse> = _data

    private val _error = SingleLiveEvent<String>()
    val error: LiveData<String> = _error

    init {
        disposables.addAll(loginRepository.data.subscribe {
            _data.postValue(it)
        }, loginRepository.error.subscribe {
            _error.postValue(it)
        })
    }

    fun executeLoginHrm(username: String, password: String) {
        val loginBodyRequest = Gson().toJson(LoginBodyRequest(username, password))
        loginRepository.getData(loginBodyRequest)
    }

    fun onClickButton() {
        _onClick.postValue(Unit)
    }
}