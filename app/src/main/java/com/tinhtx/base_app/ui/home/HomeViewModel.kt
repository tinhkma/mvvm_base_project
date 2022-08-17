/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:56 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 8:59 PM
 *
 */

package com.tinhtx.base_app.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.tinhtx.base_app.base.BaseViewModel
import com.tinhtx.base_app.di.commom.LoadState
import com.tinhtx.base_app.extension.ApiException
import com.tinhtx.base_app.repository.TokenResponse
import com.tinhtx.base_app.ui.home.repository.HomeRepository
import com.tinhtx.base_app.utils.SingleLiveEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val homeRepository: HomeRepository
) : BaseViewModel() {

    data class Data(val tokenResponse: TokenResponse)

    private val _onClick = SingleLiveEvent<Unit>()
    val onClick: LiveData<Unit> = _onClick

    private val _loadState = MutableStateFlow<LoadState>(LoadState.NotLoading)
    val loadState: StateFlow<LoadState> = _loadState

    private val _data = MutableStateFlow<Data?>(null)
    val data: StateFlow<Data?> = _data

    fun onClickButton() {
        _onClick.value = Unit
    }

    fun getData() = viewModelScope.launch {
        _loadState.value = LoadState.Loading
        flow {
            emit(homeRepository.getData())
        }.flowOn(Dispatchers.IO).map {
            Data(it)
        }.catch {
            val message = if (it is ApiException) {
                if (it.code == 500) {
                    ApiException.userNotFound.message
                } else {
                    it.message
                }
            } else {
                ApiException.unknown.message
            }!!
            _loadState.value = LoadState.Error(message)
        }.collect {
            _data.value = it
            _loadState.value = LoadState.NotLoading
        }
    }

}
