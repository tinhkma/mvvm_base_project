/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:56 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 8:59 PM
 *
 */

package com.tinhtx.base_app.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tinhtx.base_app.base.BaseViewModel
import com.tinhtx.base_app.utils.SingleLiveEvent
import javax.inject.Inject

class NotificationsViewModel @Inject constructor() : BaseViewModel() {

    private val _text = SingleLiveEvent<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text
}
