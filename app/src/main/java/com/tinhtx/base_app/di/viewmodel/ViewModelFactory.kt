/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:42 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:42 PM
 *
 */

package com.tinhtx.base_app.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class ViewModelFactory @Inject constructor(
    private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return (creators[modelClass]?.get() as? T)
            ?: creators
                .filterKeys { modelClass.isAssignableFrom(it) }
                .mapNotNull { it.value as? T }
                .firstOrNull()
            ?: throw IllegalArgumentException("unknown model class $modelClass")
    }
}