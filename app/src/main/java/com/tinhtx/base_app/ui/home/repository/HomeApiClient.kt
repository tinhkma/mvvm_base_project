/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:08 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:08 AM
 *
 */

package com.tinhtx.base_app.ui.home.repository

import com.tinhtx.base_app.repository.DataSampleResponse
import com.tinhtx.base_app.repository.api.ApiConstants
import com.tinhtx.base_app.ui.home.model.AssetsDataResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface HomeApiClient {

    /*@GET(ApiConstants.DATA_ASSETS_END_POINT)
    fun getAssetsData(): Single<Response<AssetsDataResponse>>*/
}