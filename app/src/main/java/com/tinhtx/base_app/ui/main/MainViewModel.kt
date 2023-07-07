package com.tinhtx.base_app.ui.main

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LiveData
import androidx.lifecycle.OnLifecycleEvent
import com.tinhtx.base_app.base.BaseViewModel
import com.tinhtx.base_app.utils.LocalManager
import com.tinhtx.base_app.utils.SingleLiveEvent
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository, val localManager: LocalManager
) : BaseViewModel() {
    private val _token = SingleLiveEvent<String>()
    val token: LiveData<String> = _token

    init {
        disposables.addAll(mainRepository.token.subscribe {
            _token.value = it
        })
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun getToken() {
        mainRepository.getTokenKey()
    }
}
