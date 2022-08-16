/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:30 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:30 PM
 *
 */

package com.tinhtx.base_app.ui.home

import androidx.lifecycle.ViewModel
import com.tinhtx.base_app.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.migration.DisableInstallInCheck
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class HomeModule {

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel
}