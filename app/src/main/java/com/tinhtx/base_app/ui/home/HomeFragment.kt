package com.tinhtx.base_app.ui.home

import com.tinhtx.base_app.R
import com.tinhtx.base_app.base.BaseFragment
import com.tinhtx.base_app.base.navigate
import com.tinhtx.base_app.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val viewModelClass: Class<HomeViewModel> = HomeViewModel::class.java
    override val layoutRes: Int = R.layout.fragment_home

    override fun onDataBound(binding: FragmentHomeBinding) {
        binding.viewModel = viewModel
        viewModel.let {
            it.onClick.observe(viewLifecycleOwner) {
                navigate(HomeFragmentDirections.toNavigationDashboard())
            }
            it.data.observe(viewLifecycleOwner) {
                //TODO
            }
            it.error.observe(viewLifecycleOwner) {
                //TODO
            }
        }
    }
}
