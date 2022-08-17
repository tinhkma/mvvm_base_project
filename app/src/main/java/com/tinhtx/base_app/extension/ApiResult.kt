/*
 * *
 *  * Created by tinhtx on 8/17/22, 11:46 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 11:00 AM
 *
 */

package com.tinhtx.base_app.extension

import com.slack.eithernet.ApiResult
import com.tinhtx.base_app.di.api.ApiError
import com.tinhtx.base_app.di.api.toException
import timber.log.Timber

fun <T : Any, E : ApiError> ApiResult<T, E>.getValue(): T {
    return when (this) {
        is ApiResult.Success -> value
        is ApiResult.Failure.HttpFailure -> {
            Timber.e("HttpFailure: $code: $error")
            error?.let { throw it.toException() }
            when (code) {
                404 -> { throw ApiException.userNotFound }
                500 -> { throw ApiException.serverError }
            }
            throw ApiException.unknown
        }
        is ApiResult.Failure.ApiFailure -> {
            Timber.e("ApiFailure: $error")
            error?.let { throw it.toException() }
            throw ApiException.unknown
        }
        is ApiResult.Failure.NetworkFailure -> {
            Timber.e("NetworkFailure: $error")
            throw ApiException.offline
        }
        is ApiResult.Failure.UnknownFailure -> {
            Timber.e("UnknownFailure: $error")
            throw ApiException.unknown
        }
        else -> throw ApiException.unknown
    }
}

class ApiException(val code: Int, message: String) : RuntimeException(message) {
    companion object {
        val offline = ApiException(-99, "offline")
        val unknown = ApiException(-1, "unknown")
        val userNotFound = ApiException(404, "userNotFound")
        val serverError = ApiException(500, "serverError")
    }
}