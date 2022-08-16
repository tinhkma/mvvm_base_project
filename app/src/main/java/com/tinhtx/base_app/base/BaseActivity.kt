/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:45 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:45 PM
 *
 */

package com.tinhtx.base_app.base

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<T : ViewDataBinding, U : BaseViewModel> : DaggerAppCompatActivity(), DataBindable<T> {

    protected abstract val viewModelClass: Class<U>

    @Inject
    protected lateinit var viewModelFactory: ViewModelProvider.Factory
    protected val viewModel: U by lazy { ViewModelProviders.of(this, viewModelFactory).get(viewModelClass) }

    override lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(viewModel)
        DataBindingUtil.setContentView<T>(this, layoutRes)
            .let {
                it.setLifecycleOwner(this)
                binding = it
                onDataBound(it)
            }
    }
}