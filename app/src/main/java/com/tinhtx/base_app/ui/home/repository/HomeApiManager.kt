/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:24 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:24 AM
 *
 */

package com.tinhtx.base_app.ui.home.repository

import com.tinhtx.base_app.repository.DataSampleResponse
import com.tinhtx.base_app.repository.api.ApiManager
import com.tinhtx.base_app.ui.home.model.AssetsDataResponse
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeApiManager @Inject constructor(
    private val apiManager: ApiManager,
    private val homeApiClient: HomeApiClient
) {
    /*fun getAssetsData(): Single<AssetsDataResponse> {
        return homeApiClient.getAssetsData().map { apiManager.handleResponse(it) }
    }*/
}