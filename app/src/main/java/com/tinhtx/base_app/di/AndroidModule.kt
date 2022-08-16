/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:20 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:20 PM
 *
 */

package com.tinhtx.base_app.di

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Suppress("unused")
@Module
class AndroidModule {

    @Provides
    @Singleton
    internal fun providePreferences(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}