/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:08 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:08 AM
 *
 */

package com.tinhtx.base_app.ui.home.repository

import com.slack.eithernet.ApiResult
import com.tinhtx.base_app.di.api.ApiError
import com.tinhtx.base_app.repository.TokenResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface HomeApiService {

    @GET("authentication/token/new")
    suspend fun getData(
        @Query("api_key") apiKey: String
    ): ApiResult<TokenResponse, ApiError>
}