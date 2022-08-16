/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:56 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 8:59 PM
 *
 */

package com.tinhtx.base_app.ui.home

import androidx.lifecycle.LiveData
import com.tinhtx.base_app.base.BaseViewModel
import com.tinhtx.base_app.ui.home.repository.HomeRepository
import com.tinhtx.base_app.utils.SingleLiveEvent
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val homeRepository: HomeRepository
) : BaseViewModel() {

    private val _onClick = SingleLiveEvent<Unit>()
    val onClick: LiveData<Unit> = _onClick

    private val _data = SingleLiveEvent<String>()
    val data: LiveData<String> = _data

    private val _error = SingleLiveEvent<String>()
    val error: LiveData<String> = _error

    init {
        disposables.addAll(
            homeRepository.data.subscribe {
                _data.value = it
            },
            homeRepository.error.subscribe {
                _error.value = it
            }
        )
    }

    fun onClickButton() {
        _onClick.value = Unit
        homeRepository.getData()
    }
}
