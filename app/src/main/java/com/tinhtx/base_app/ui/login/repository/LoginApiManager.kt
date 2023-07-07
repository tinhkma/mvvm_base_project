/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:24 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:24 AM
 *
 */

package com.tinhtx.base_app.ui.login.repository

import com.tinhtx.base_app.repository.api.ApiManager
import com.tinhtx.base_app.ui.login.model.LoginResponse
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoginApiManager @Inject constructor(
    private val apiManager: ApiManager,
    private val homeApiClient: LoginApiClient
) {
    fun loginToHrm(bodyRequest: String): Single<LoginResponse> {
        return homeApiClient.login(bodyRequest).map { apiManager.handleResponse(it) }
    }
}