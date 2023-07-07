/*
 * *
 *  * Created by tinhtx on 7/7/23, 2:30 PM
 *  * Copyright (c) 2023 . All rights reserved.
 *  * Last modified 7/7/23, 2:30 PM
 *
 */

package com.tinhtx.base_app.ui.home.adapter

import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import com.tinhtx.base_app.R
import com.tinhtx.base_app.databinding.ItemFragmentHomeInfoEmployeeBinding
import com.tinhtx.base_app.ui.home.model.EmployeeInfoData
import com.xwray.groupie.viewbinding.BindableItem

class EmployeeDataItem(val dataItem: EmployeeInfoData) :
    BindableItem<ItemFragmentHomeInfoEmployeeBinding>() {
    override fun bind(viewBinding: ItemFragmentHomeInfoEmployeeBinding, position: Int) {
        viewBinding.data = dataItem
        if (position == 0) {
            viewBinding.tvInfo.typeface = Typeface.DEFAULT_BOLD
            viewBinding.tvInfo.gravity = Gravity.CENTER
        }
    }

    override fun getLayout(): Int {
        return R.layout.item_fragment_home_info_employee
    }

    override fun initializeViewBinding(view: View): ItemFragmentHomeInfoEmployeeBinding {
        return ItemFragmentHomeInfoEmployeeBinding.bind(view)
    }
}