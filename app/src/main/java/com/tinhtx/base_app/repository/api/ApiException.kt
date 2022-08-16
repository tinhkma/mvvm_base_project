/*
 * *
 *  * Created by TinhTX on 8/17/22, 12:26 AM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:26 AM
 *
 */

package com.tinhtx.base_app.repository.api

open class ApiException(
    code: Int,
    message: String
) : RuntimeException("code: $code, message: $message")