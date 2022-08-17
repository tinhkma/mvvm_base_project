/*
 * *
 *  * Created by tinhtx on 8/17/22, 11:51 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 10:05 AM
 *
 */

package com.tinhtx.base_app.repository


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TokenResponse(
    @SerializedName("expires_at")
    val expiresAt: String,
    @SerializedName("request_token")
    val requestToken: String,
    @SerializedName("success")
    val success: Boolean
) : Serializable