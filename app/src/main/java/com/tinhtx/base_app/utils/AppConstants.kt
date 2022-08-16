/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:07 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:07 PM
 *
 */

package com.tinhtx.base_app.utils

import android.os.Build
import com.tinhtx.base_app.BuildConfig

object AppConstants {

    val USER_AGENT =
        "android / " + Build.VERSION.SDK_INT + " / " +
                Build.VERSION.RELEASE + " / " +
                BuildConfig.VERSION_NAME + " / " +
                Build.MODEL + " / " +
                Build.MANUFACTURER + " / " +
                Build.BRAND

    const val PREF_FILE_NAME = "com.hdk24.basemvp.PREF_FILE_KEY"
}