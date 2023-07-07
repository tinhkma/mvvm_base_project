/*
 * *
 *  * Created by tinhtx on 7/6/23, 4:47 PM
 *  * Copyright (c) 2023 . All rights reserved.
 *  * Last modified 7/6/23, 4:47 PM
 *
 */

package com.tinhtx.base_app.repository.api


import com.google.gson.annotations.SerializedName

data class ApiErrorException(
    @SerializedName("message")
    val message: String,
    @SerializedName("success")
    val success: Boolean
)