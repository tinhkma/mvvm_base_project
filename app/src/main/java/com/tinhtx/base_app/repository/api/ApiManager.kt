/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:26 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:26 AM
 *
 */

package com.tinhtx.base_app.repository.api

import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import retrofit2.HttpException
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiManager @Inject constructor() {

    fun <T : ApiResponse> handleResponse(response: Response<T>): T {
        if (response.isSuccessful) {
            return response.body() ?: throw HttpException(response)
        }
        val errorBody = response.errorBody()?.string() ?: throw HttpException(response)
        val error = convertFromJson(errorBody).let { createError(it) }
        throw error ?: ApiException(response.code(), errorBody)
    }

    private fun convertFromJson(json: String): ApiResponse {
        return try {
            Gson().fromJson<ApiResponse>(json, ApiResponse::class.java)
        } catch (e: JsonSyntaxException) {
            throw JsonSyntaxException(json, e)
        }
    }

    private fun createError(response: ApiResponse): ApiException? {
        val body = response.body ?: return null
        //Customer exception
        return ApiException(body.code, body.message)
    }
}