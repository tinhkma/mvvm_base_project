/*
 * *
 *  * Created by TinhTX on 8/16/22, 11:24 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 11:24 PM
 *
 */

package com.tinhtx.base_app.di.viewmodel

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)