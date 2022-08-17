package com.tinhtx.base_app.ui.home

import androidx.lifecycle.lifecycleScope
import com.tinhtx.base_app.R
import com.tinhtx.base_app.base.BaseFragment
import com.tinhtx.base_app.base.navigate
import com.tinhtx.base_app.base.showToast
import com.tinhtx.base_app.databinding.FragmentHomeBinding
import com.tinhtx.base_app.di.commom.LoadState
import com.tinhtx.base_app.di.commom.LoadStateHUD
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.launch

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    private lateinit var loadStateHUD: LoadStateHUD

    override val viewModelClass: Class<HomeViewModel> = HomeViewModel::class.java
    override val layoutRes: Int = R.layout.fragment_home

    override fun onDataBound(binding: FragmentHomeBinding) {
        binding.viewModel = viewModel
        loadStateHUD = LoadStateHUD(requireActivity())
        viewModel.let {
            it.onClick.observe(viewLifecycleOwner) {
                viewModel.getData()
            }
        }

        lifecycleScope.launch {
            viewModel.data
                .mapNotNull { it }
                .collectLatest {
                    showToast(it.tokenResponse.requestToken)
                    navigate(HomeFragmentDirections.toNavigationDashboard())
                }
        }

        viewLifecycleOwner.lifecycleScope.launchWhenResumed {
            viewModel.loadState.collectLatest {
                when (it) {
                    is LoadState.Loading -> {
                        loadStateHUD.state = it
                    }
                    is LoadState.Error -> {
                        //TODO Error Layout
                    }
                    else -> {
                        loadStateHUD.state = it
                    }
                }
            }
        }
    }
}
