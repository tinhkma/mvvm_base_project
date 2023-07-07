/*
 * *
 *  * Created by tinhtx on 7/6/23, 1:27 PM
 *  * Copyright (c) 2023 . All rights reserved.
 *  * Last modified 7/6/23, 1:27 PM
 *
 */

package com.tinhtx.base_app.ui.login

import android.content.Intent
import android.os.Bundle
import com.google.gson.Gson
import com.tinhtx.base_app.R
import com.tinhtx.base_app.base.BaseActivity
import com.tinhtx.base_app.base.showToast
import com.tinhtx.base_app.databinding.ActivityLoginBinding
import com.tinhtx.base_app.ui.main.MainActivity

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>() {

    override val viewModelClass: Class<LoginViewModel> = LoginViewModel::class.java
    override val layoutRes: Int = R.layout.activity_login

    override fun onDataBound(binding: ActivityLoginBinding) {
        binding.viewModel = viewModel
        viewModel.let {
            it.onClick.observe(this) {
                val username = binding.tvUsername.text.toString()
                val password = binding.tvPassword.text.toString()
                if (validateLogin(username, password)) {
                    hideKeyboard(binding.root)
                    viewModel.executeLoginHrm(username, password)
                } else showToast(getString(R.string.tv_fill_login_error))
            }
            it.data.observe(this) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            it.error.observe(this) {
                showToast(it)
            }
        }
    }

    private fun validateLogin(username: String, password: String): Boolean {
        return username.isNotEmpty() || password.isNotEmpty()
    }
}