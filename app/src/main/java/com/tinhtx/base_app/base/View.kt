/*
 * *
 *  * Created by TinhTX on 8/16/22, 11:43 PM
 *  * Copyright (c) 2022 . All rights reserved.
 *  * Last modified 8/16/22, 11:43 PM
 *
 */

package com.tinhtx.base_app.base

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import com.tinhtx.base_app.R

fun Fragment.showToast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    requireContext().showToast(text, duration)
}

fun Fragment.navigate(direction: NavDirections) {
    view?.findNavController()?.let {
        if (it.currentDestination?.getAction(direction.actionId) != null) {
            it.navigate(direction)
        }
    }
}

fun Fragment.navigate(id: Int) {
    view?.findNavController()?.let {
        it.navigate(id)
    }
}

fun Fragment.back() {
    view?.findNavController()?.popBackStack()
}

fun Fragment.setTitle(title: String) {
    (requireActivity() as AppCompatActivity).supportActionBar?.title = title
}

fun Fragment.showBrowser(url: Uri) {
    startActivity(Intent(Intent.ACTION_VIEW).apply { data = url })
}

fun Activity.showBrowser(url: Uri) {
    startActivity(Intent(Intent.ACTION_VIEW).apply { data = url })
}

fun Fragment.setSystemColor(@ColorRes statusBarColorRes: Int, @ColorRes actionBarColorRes: Int) {
    activity?.setSystemColor(statusBarColorRes, actionBarColorRes)
}

fun Activity.setSystemColor(@ColorRes statusBarColorRes: Int, @ColorRes actionBarColorRes: Int) {
    setStatusBarColor(statusBarColorRes)
    setActionBarColor(actionBarColorRes)
}

fun Activity.setStatusBarColor(@ColorRes colorRes: Int) {
    window.also {
        it.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        it.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        it.statusBarColor = ContextCompat.getColor(this, colorRes)
    }
}

fun Activity.setActionBarColor(@ColorRes colorRes: Int) {
    ColorDrawable(ContextCompat.getColor(this, colorRes))
        .let { (this as? AppCompatActivity)?.supportActionBar?.setBackgroundDrawable(it) }
}

fun Context.showToast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}

fun View.setVisibility(visible: Boolean) {
    this.visibility = if (visible) View.VISIBLE else View.GONE
}

fun ActionBar.showBackArrow(shouldShow: Boolean) {
    this.setDisplayHomeAsUpEnabled(shouldShow)
}