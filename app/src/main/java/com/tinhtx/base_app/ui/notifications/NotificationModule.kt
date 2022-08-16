/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:30 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:30 PM
 *
 */

package com.tinhtx.base_app.ui.notifications

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
abstract class NotificationModule {

    @ContributesAndroidInjector
    abstract fun contributeNotificationsFragment(): NotificationsFragment

    @Binds
    @IntoMap
    @ViewModelKey(NotificationsViewModel::class)
    abstract fun bindNotificationsViewModel(viewModel: NotificationsViewModel): ViewModel
}