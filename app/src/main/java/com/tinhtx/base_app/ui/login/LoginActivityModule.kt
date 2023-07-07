/*
 * *
 *  * Created by tinhtx on 7/6/23, 1:32 PM
 *  * Copyright (c) 2023 . All rights reserved.
 *  * Last modified 7/6/23, 1:32 PM
 *
 */

package com.tinhtx.base_app.ui.login

import androidx.lifecycle.ViewModel
import com.tinhtx.base_app.di.viewmodel.ViewModelKey
import com.tinhtx.base_app.ui.dashboard.DashboardModule
import com.tinhtx.base_app.ui.home.HomeModule
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
abstract class LoginActivityModule {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindMainViewModel(viewModel: LoginViewModel): ViewModel
}