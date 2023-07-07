/*
 * *
 *  * Created by tinhtx on 7/6/23, 1:12 PM
 *  * Copyright (c) 2023 . All rights reserved.
 *  * Last modified 7/6/23, 1:12 PM
 *
 */

package com.tinhtx.base_app.ui.login.model


import com.google.gson.annotations.SerializedName

data class LoginBodyRequest(
    @SerializedName("username")
    val username: String,
    @SerializedName("password")
    val password: String
)