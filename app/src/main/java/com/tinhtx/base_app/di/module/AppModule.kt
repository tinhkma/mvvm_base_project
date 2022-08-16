/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:37 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:28 PM
 *
 */

package com.tinhtx.base_app.di.module

import android.content.Context
import com.tinhtx.base_app.CustomApplication
import com.tinhtx.base_app.di.AndroidModule
import com.tinhtx.base_app.di.api.ApiModule
import dagger.Binds
import dagger.Module

@Suppress("unused")
@Module(includes = [AndroidModule::class, ApiModule::class])
abstract class AppModule {

    @Binds
    abstract fun bindContext(app: CustomApplication): Context
}