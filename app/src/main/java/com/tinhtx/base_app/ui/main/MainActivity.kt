package com.tinhtx.base_app.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.gson.Gson
import com.tinhtx.base_app.R
import com.tinhtx.base_app.base.BaseActivity
import com.tinhtx.base_app.base.setVisibility
import com.tinhtx.base_app.base.showBackArrow
import com.tinhtx.base_app.base.showToast
import com.tinhtx.base_app.databinding.ActivityMainBinding
import com.tinhtx.base_app.ui.login.LoginActivity
import com.tinhtx.base_app.ui.login.model.LoginResponse

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(),
    NavController.OnDestinationChangedListener {

    override val viewModelClass: Class<MainViewModel> = MainViewModel::class.java
    override val layoutRes: Int = R.layout.activity_main
    var dataEmployee: LoginResponse? = null

    override fun onDataBound(binding: ActivityMainBinding) {
        binding.toolbar.setup()
        getNavController().addOnDestinationChangedListener(this)
        viewModel.let {
            it.token.observe(this) {
                if (it.isNullOrEmpty()) {
                    showLogin()
                } else {
                    showToast(getString(R.string.tv_toast_welcome_back))
                }
            }
        }
    }

    private fun showLogin() {
        showToast(getString(R.string.tv_toast_logout))
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun Toolbar.setup() {
        setSupportActionBar(this)
        setupActionBarWithNavController(getNavController())
    }

    private fun getNavController(): NavController {
        return findNavController(R.id.nav_host_fragment_activity_main)
    }

    override fun onDestinationChanged(
        controller: NavController, destination: NavDestination, arguments: Bundle?
    ) {
        invalidateOptionsMenu()
        when (destination.id) {
            R.id.navigation_home -> {
                binding.toolbar.setVisibility(true)
                supportActionBar?.showBackArrow(false)
            }

            R.id.navigation_dashboard -> {
                binding.toolbar.setVisibility(true)
                supportActionBar?.showBackArrow(true)
            }

            else -> {
                binding.toolbar.setVisibility(true)
                supportActionBar?.showBackArrow(true)
            }
        }
    }

    override fun onBackPressed() {
        when (getNavController().currentDestination?.id) {
            R.id.navigation_home -> finish()
            else -> getNavController().navigateUp()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        getNavController().navigateUp()
        return true
    }
}
