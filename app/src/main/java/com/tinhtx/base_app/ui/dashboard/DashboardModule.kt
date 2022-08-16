/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:30 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:30 PM
 *
 */

package com.tinhtx.base_app.ui.dashboard

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
abstract class DashboardModule {

    @ContributesAndroidInjector
    abstract fun contributeDashboardFragment(): DashboardFragment

    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel::class)
    abstract fun bindDashboardViewModel(viewModel: DashboardViewModel): ViewModel
}