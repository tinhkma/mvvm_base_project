/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:54 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:54 PM
 *
 */

package com.tinhtx.base_app.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<T : ViewDataBinding, U : BaseViewModel> : DaggerFragment(), DataBindable<T> {

    protected abstract val viewModelClass: Class<U>

    @Inject
    protected lateinit var viewModelFactory: ViewModelProvider.Factory
    protected val viewModel: U by lazy { ViewModelProviders.of(this, viewModelFactory).get(viewModelClass) }

    override var binding: T? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        lifecycle.addObserver(viewModel)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return DataBindingUtil.inflate<T>(inflater, layoutRes, container, false)
            .also {
                it.setLifecycleOwner(this)
                binding = it
                onDataBound(it)
            }
            .root
    }

    override fun onDestroyView() {
        binding?.setLifecycleOwner(null)
        binding = null
        super.onDestroyView()
    }
}