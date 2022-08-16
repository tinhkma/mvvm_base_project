package com.tinhtx.base_app.ui.dashboard

import com.tinhtx.base_app.R
import com.tinhtx.base_app.base.BaseFragment
import com.tinhtx.base_app.base.navigate
import com.tinhtx.base_app.databinding.FragmentDashboardBinding

class DashboardFragment : BaseFragment<FragmentDashboardBinding, DashboardViewModel>() {

    override val viewModelClass: Class<DashboardViewModel> = DashboardViewModel::class.java
    override val layoutRes: Int = R.layout.fragment_dashboard

    override fun onDataBound(binding: FragmentDashboardBinding) {
        binding.viewModel = viewModel
        viewModel.onClick.observe(viewLifecycleOwner) {
            navigate(DashboardFragmentDirections.toNavigationNotifications())
        }
    }
}
