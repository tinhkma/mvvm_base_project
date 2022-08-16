/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:22 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:22 PM
 *
 */

package com.tinhtx.base_app.repository.api

import android.os.Build
import com.tinhtx.base_app.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class UserAgentInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response? {
        return chain.request().newBuilder()
            .header("User-Agent", "base_app/${BuildConfig.VERSION_NAME} Android/${Build.VERSION.SDK_INT}")
            .build()
            .let { chain.proceed(it) }
    }
}