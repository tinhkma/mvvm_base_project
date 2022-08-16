/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:21 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:21 PM
 *
 */

package com.tinhtx.base_app.di.api

import com.tinhtx.base_app.BuildConfig
import com.tinhtx.base_app.repository.api.ApiConstants
import com.tinhtx.base_app.repository.api.UserAgentInterceptor
import com.tinhtx.base_app.ui.home.repository.HomeApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Suppress("unused")
@Module
class ApiModule {

    @Provides
    @Singleton
    fun provideLogInterceptor(): HttpLoggingInterceptor {
        return (if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BASIC else HttpLoggingInterceptor.Level.NONE)
            .let { HttpLoggingInterceptor().setLevel(it) }
    }

    @Provides
    @Singleton
    fun provideClient(logInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(UserAgentInterceptor())
            .addInterceptor(logInterceptor)
            .readTimeout(2, TimeUnit.MINUTES)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(ApiConstants.DOMAIN_API)
            .client(client)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    internal fun provideHomeApiClient(retrofit: Retrofit): HomeApiClient {
        return retrofit.create(HomeApiClient::class.java)
    }
}