/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:08 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:08 AM
 *
 */

package com.tinhtx.base_app.ui.login.repository

import com.tinhtx.base_app.repository.api.ApiConstants
import com.tinhtx.base_app.ui.login.model.LoginResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface LoginApiClient {

    @Headers("Content-Type: application/json")
    @POST(ApiConstants.LOGIN_END_POINT)
    fun login(@Body body: String): Single<Response<LoginResponse>>
}