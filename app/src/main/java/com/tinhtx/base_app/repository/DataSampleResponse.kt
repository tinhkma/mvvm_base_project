/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:21 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:21 AM
 *
 */

package com.tinhtx.base_app.repository

import com.google.gson.annotations.SerializedName
import com.tinhtx.base_app.repository.api.ApiResponse

data class DataSampleResponse(
    @SerializedName("data")
    val data: String
) : ApiResponse()