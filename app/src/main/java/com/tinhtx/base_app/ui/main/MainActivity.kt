package com.tinhtx.base_app.ui.main

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.tinhtx.base_app.R
import com.tinhtx.base_app.base.BaseActivity
import com.tinhtx.base_app.base.setVisibility
import com.tinhtx.base_app.base.showBackArrow
import com.tinhtx.base_app.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(),
    NavController.OnDestinationChangedListener {

    override val viewModelClass: Class<MainViewModel> = MainViewModel::class.java
    override val layoutRes: Int = R.layout.activity_main

    override fun onDataBound(binding: ActivityMainBinding) {
        binding.toolbar.setup()
        getNavController().addOnDestinationChangedListener(this)
    }

    private fun Toolbar.setup() {
        setSupportActionBar(this)
        setupActionBarWithNavController(getNavController())
    }

    private fun getNavController(): NavController {
        return findNavController(R.id.nav_host_fragment_activity_main)
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
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
