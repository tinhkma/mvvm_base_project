/*
 * *
 *  * Created by tinhtx on 8/17/22, 9:14 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 9:14 AM
 *
 */

package com.tinhtx.base_app.di.commom

sealed class LoadState {
    object NotLoading : LoadState()
    object Loading : LoadState()
    data class Error(val message: String) : LoadState()
}

// androidx.paging.LoadState to LoadState
fun androidx.paging.LoadState.toAppLoadState(): LoadState {
    return when (this) {
        is androidx.paging.LoadState.NotLoading -> LoadState.NotLoading
        is androidx.paging.LoadState.Loading -> LoadState.Loading
        is androidx.paging.LoadState.Error -> LoadState.Error(error.message ?: "")
    }
}