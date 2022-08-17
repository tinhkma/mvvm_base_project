/*
 * *
 *  * Created by tinhtx on 8/17/22, 12:22 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/17/22, 12:22 PM
 *
 */

package com.tinhtx.base_app.di.commom

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import com.kaopiz.kprogresshud.KProgressHUD

class LoadStateHUD(context: Context) {
    private val loadingHUD = LoadingHUD(context)
    private val errorHUD = ErrorHUD(context)

    var state: LoadState = LoadState.NotLoading
        get() = field
        set(value) {
            when (value) {
                LoadState.NotLoading -> loadingHUD.dismiss()
                LoadState.Loading -> loadingHUD.show()
                is LoadState.Error -> {
                    loadingHUD.dismiss()
                    errorHUD.showMessage(value.message)
                }
            }
            field = value
        }
}

private class LoadingHUD(context: Context) : KProgressHUD(context) {
    init {
        this.setBackgroundColor(android.R.color.transparent)
            .setDimAmount(0.5f)
    }
}

private class ErrorHUD(context: Context) : KProgressHUD(context) {
    init {
        this.setBackgroundColor(android.R.color.transparent)
            .setCustomView(TextView(context))
            .setDimAmount(0.5f)
    }

    fun showMessage(message: String, displayMillis: Long = 2000L) {
        setLabel(message)
        show()
        Handler(Looper.getMainLooper()).postDelayed({
            dismiss()
            setLabel(null)
        }, displayMillis)
    }
}