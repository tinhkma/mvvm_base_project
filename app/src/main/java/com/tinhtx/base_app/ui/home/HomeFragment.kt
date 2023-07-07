package com.tinhtx.base_app.ui.home

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tinhtx.base_app.R
import com.tinhtx.base_app.base.BaseFragment
import com.tinhtx.base_app.databinding.FragmentHomeBinding
import com.tinhtx.base_app.ui.home.adapter.EmployeeDataItem
import com.tinhtx.base_app.ui.home.model.EmployeeInfoData
import com.tinhtx.base_app.ui.login.model.LoginResponse
import com.xwray.groupie.Group
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(), HomeListener {

    override val viewModelClass: Class<HomeViewModel> = HomeViewModel::class.java
    override val layoutRes: Int = R.layout.fragment_home

    private lateinit var recyclerView: RecyclerView
    private lateinit var listener: HomeListener
    private val groupAdapter = GroupAdapter<GroupieViewHolder>()

    override fun onDataBound(binding: FragmentHomeBinding) {
        binding.viewModel = viewModel
        listener = this
        recyclerView = binding.rcvEmployeeInfo
        recyclerView.setupRcv()
        viewModel.let {
            it.employeeData.observe(this) {
                if (it != null)
                    groupAdapter.update(setData(it))
            }
        }
    }

    private fun setData(employeeData: LoginResponse.EmployeeData): MutableList<Group> {
        val data = mutableListOf<Group>()

        employeeData.let {
            data.add(EmployeeDataItem(EmployeeInfoData(null, it.user.employee.fullName)))
            data.add(EmployeeDataItem(EmployeeInfoData("Email:", it.user.employee.email)))
            data.add(EmployeeDataItem(EmployeeInfoData("Employee ID:", it.user.username)))
            data.add(
                EmployeeDataItem(
                    EmployeeInfoData(
                        "Employee Code:",
                        it.user.employee.employeeCode
                    )
                )
            )
            data.add(EmployeeDataItem(EmployeeInfoData("Birth Day:", it.user.employee.birthDay)))
        }
        return data
    }

    private fun RecyclerView.setupRcv() {
        adapter = groupAdapter.apply {
            setOnItemClickListener { item, _ ->
                listener.onClickItem()
            }
        }
        val linearLayoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        layoutManager = linearLayoutManager

    }

    override fun onClickItem() {

    }
}
