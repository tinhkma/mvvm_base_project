/*
 * *
 *  * Created by tinhtx on 7/6/23, 5:13 PM
 *  * Copyright (c) 2023 . All rights reserved.
 *  * Last modified 7/6/23, 5:13 PM
 *
 */

package com.tinhtx.base_app.ui.main

import com.tinhtx.base_app.utils.LocalManager
import io.reactivex.Observable
import io.reactivex.subjects.BehaviorSubject
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val localManager: LocalManager
) {
    private val _token = BehaviorSubject.create<String>()
    val token: Observable<String> = _token.hide()

    fun getTokenKey() {
        val token = localManager.preferences.getString(LocalManager.PREFERENCE_KEY_TOKEN) ?: ""
        _token.onNext(token)
    }
}