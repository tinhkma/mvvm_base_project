/*
 * *
 *  * Created by tinhtx on 8/17/22, 9:06 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 9:06 AM
 *
 */

package com.tinhtx.base_app.di.api

import com.tinhtx.base_app.extension.ApiException
import java.io.Serializable

data class ApiError(
    val code: Int?,
    val message: String
) : Serializable

// ApiError to ApiException
fun ApiError.toException(): ApiException {
    code?.let {
        return ApiException(it, message)
    }
    return ApiException.unknown
}
