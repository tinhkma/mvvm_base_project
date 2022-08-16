/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:47 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:47 PM
 *
 */

package com.tinhtx.base_app.base

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel() : ViewModel(), LifecycleObserver {

    protected val disposables = CompositeDisposable()

    override fun onCleared() {
        disposables.clear()
    }

    private fun dispose() {
        disposables.clear()
        disposables.dispose()
    }
}