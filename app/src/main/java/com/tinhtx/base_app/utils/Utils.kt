/*
 * *
 *  * Created by tinhtx on 7/7/23, 2:10 PM
 *  * Copyright (c) 2023 . All rights reserved.
 *  * Last modified 7/7/23, 2:10 PM
 *
 */

package com.tinhtx.base_app.utils

import com.google.gson.Gson
import com.google.gson.JsonSyntaxException

fun Gson.toJson(T: Any): String? {
    return try {
        Gson().toJson(T)
    } catch (ex: JsonSyntaxException) {
        AppLogger.e(ex.message)
        null
    }
}
fun Gson.fromJson(json: String, T: Any): Any? {
    return try {
        Gson().fromJson(json, T::class.java)
    } catch (ex: JsonSyntaxException) {
        AppLogger.e(ex.message)
        null
    }
}