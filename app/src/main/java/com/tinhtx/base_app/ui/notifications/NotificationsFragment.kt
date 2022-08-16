package com.tinhtx.base_app.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tinhtx.base_app.R
import com.tinhtx.base_app.base.BaseFragment
import com.tinhtx.base_app.databinding.FragmentNotificationsBinding

class NotificationsFragment : BaseFragment<FragmentNotificationsBinding, NotificationsViewModel>() {

    override val viewModelClass: Class<NotificationsViewModel> = NotificationsViewModel::class.java
    override val layoutRes: Int = R.layout.fragment_notifications

    override fun onDataBound(binding: FragmentNotificationsBinding) {
        val textView: TextView = binding.textNotifications
        viewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
    }
}
