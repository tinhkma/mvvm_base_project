/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:10 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:10 AM
 *
 */

package com.tinhtx.base_app.utils

import androidx.annotation.MainThread
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import java.util.concurrent.atomic.AtomicBoolean

class SingleLiveEvent<T : Any?> : MutableLiveData<T>() {
    private val pending: AtomicBoolean = AtomicBoolean(false)

    @MainThread
    override fun observe(owner: LifecycleOwner, observer: Observer<in T>) {
        if (!hasActiveObservers()) {
            super.observe(owner, Observer {
                if (pending.compareAndSet(true, false)) {
                    observer.onChanged(it)
                }
            })
        }
    }

    @MainThread
    override fun setValue(value: T?) {
        pending.set(true)
        super.setValue(value)
    }

    @MainThread
    fun call() {
        value = null
    }
}