/*
 * *
 *  * Created by TinhTX on 8/16/22, 10:07 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 10:07 PM
 *
 */

package com.tinhtx.base_app.utils

import io.reactivex.Scheduler

interface SchedulerProvider {

    fun computation(): Scheduler

    fun io(): Scheduler

    fun ui(): Scheduler
}