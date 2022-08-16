/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:30 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:30 PM
 *
 */

package com.tinhtx.base_app.di.activity

import androidx.lifecycle.ViewModel
import com.tinhtx.base_app.di.viewmodel.ViewModelKey
import com.tinhtx.base_app.ui.dashboard.DashboardModule
import com.tinhtx.base_app.ui.home.HomeModule
import com.tinhtx.base_app.ui.main.MainViewModel
import com.tinhtx.base_app.ui.notifications.NotificationModule
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module(
    includes = [
        HomeModule::class,
        DashboardModule::class,
        NotificationModule::class
    ]
)
abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}