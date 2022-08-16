/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:47 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:47 PM
 *
 */

package com.tinhtx.base_app.base

import androidx.databinding.ViewDataBinding

interface DataBindable<T : ViewDataBinding> {

    val layoutRes: Int
    val binding: T?

    fun onDataBound(binding: T)
}