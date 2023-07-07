/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:28 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:28 PM
 *
 */

package com.tinhtx.base_app.di.activity

import androidx.lifecycle.ViewModelProvider
import com.tinhtx.base_app.di.viewmodel.ViewModelFactory
import com.tinhtx.base_app.ui.login.LoginActivity
import com.tinhtx.base_app.ui.login.LoginActivityModule
import com.tinhtx.base_app.ui.main.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.migration.DisableInstallInCheck

@Suppress("unused")
@Module
abstract class ActivityModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    internal abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [LoginActivityModule::class])
    internal abstract fun contributeLoginActivity(): LoginActivity
}