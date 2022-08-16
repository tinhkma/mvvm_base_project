/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:20 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:20 AM
 *
 */

package com.tinhtx.base_app.repository.api

import com.google.gson.annotations.SerializedName

open class ApiResponse : Response {

    @SerializedName("response")
    val body: ResponseBody? = null

    data class ResponseBody(
        @SerializedName("status")
        val code: Int,
        @SerializedName("info")
        val message: String
    )
}