/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:55 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 8:59 PM
 *
 */

package com.tinhtx.base_app.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tinhtx.base_app.base.BaseViewModel
import com.tinhtx.base_app.utils.SingleLiveEvent
import javax.inject.Inject

class DashboardViewModel @Inject constructor() : BaseViewModel() {

    private val _onClick = SingleLiveEvent<Unit>()
    val onClick: LiveData<Unit> = _onClick

    fun onClickButton() {
        _onClick.value = Unit
    }
}
