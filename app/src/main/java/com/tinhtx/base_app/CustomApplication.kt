/*
 * *
 *  * Created by TinhTX on 8/16/22, 9:49 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 9:49 PM
 *
 */

package com.tinhtx.base_app

import android.annotation.SuppressLint
import android.content.Context
import androidx.multidex.MultiDex
import com.tinhtx.base_app.di.component.DaggerAppComponent
import com.tinhtx.base_app.utils.AppLogger
import com.tinhtx.base_app.utils.LocalManager
import com.tinhtx.base_app.utils.PreferenceManager
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import javax.inject.Inject

@SuppressLint("CheckResult")
class CustomApplication : DaggerApplication() {

    @Inject
    lateinit var preferenceManager: PreferenceManager

    @Inject
    lateinit var localManager: LocalManager

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        AppLogger.init()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}