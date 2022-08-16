/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:28 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:27 PM
 *
 */

package com.tinhtx.base_app.di.component

import android.app.Application
import com.tinhtx.base_app.CustomApplication
import com.tinhtx.base_app.di.activity.ActivityModule
import com.tinhtx.base_app.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityModule::class
])
interface AppComponent : AndroidInjector<CustomApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: CustomApplication): Builder

        fun build(): AppComponent
    }

    fun inject(app: Application)
}