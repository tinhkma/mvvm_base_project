/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:32 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:32 AM
 *
 */

package com.tinhtx.base_app.ui.home.repository

import com.tinhtx.base_app.extension.getValue
import com.tinhtx.base_app.repository.TokenResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeRepository @Inject constructor(
    private val homeApiService: HomeApiService
) {

    suspend fun getData(): TokenResponse {
        val apiKey = "a1916dc2316c4fa5a1b0976108165469"
        return homeApiService.getData(apiKey).getValue()
    }
}