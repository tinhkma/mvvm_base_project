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
}