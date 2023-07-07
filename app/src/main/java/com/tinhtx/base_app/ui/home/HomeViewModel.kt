/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:56 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 8:59 PM
 *
 */

package com.tinhtx.base_app.ui.home

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LiveData
import androidx.lifecycle.OnLifecycleEvent
import com.tinhtx.base_app.base.BaseViewModel
import com.tinhtx.base_app.ui.home.model.AssetsDataResponse
import com.tinhtx.base_app.ui.home.repository.HomeRepository
import com.tinhtx.base_app.ui.login.model.LoginResponse
import com.tinhtx.base_app.utils.SingleLiveEvent
import io.reactivex.subjects.BehaviorSubject
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val homeRepository: HomeRepository
) : BaseViewModel() {

    private val _onClick = SingleLiveEvent<Unit>()
    val onClick: LiveData<Unit> = _onClick

    private val _employeeData = SingleLiveEvent<LoginResponse.EmployeeData?>()
    val employeeData: LiveData<LoginResponse.EmployeeData?> = _employeeData

    private val _assetsDataResponse = SingleLiveEvent<AssetsDataResponse?>()
    val assetsDataResponse: LiveData<AssetsDataResponse?> = _assetsDataResponse

    private val _error = SingleLiveEvent<String>()
    val error: LiveData<String> = _error

    init {
        disposables.addAll(
            homeRepository.employeeData.subscribe {
                _employeeData.postValue(it)
            },
            homeRepository.assetsDataResponse.subscribe {
                _assetsDataResponse.postValue(it)
            },
            homeRepository.error.subscribe {
                _error.postValue(it)
            }
        )
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun getAssetsData(){
        /*homeRepository.getAssetsData()*/
        homeRepository.getEmployeeData()
    }

}
