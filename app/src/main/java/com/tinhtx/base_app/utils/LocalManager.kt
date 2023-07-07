/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:39 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:39 PM
 *
 */

package com.tinhtx.base_app.utils

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalManager @Inject constructor() {

    @Inject
    lateinit var preferences: PreferenceManager


    companion object {
        const val PREFERENCE_KEY_TOKEN = "PREFERENCE_KEY_TOKEN"
        const val LOGIN_RESPONSE_KEY = "LOGIN_RESPONSE_KEY"
    }
}