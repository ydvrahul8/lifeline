package com.lifeline.view.modules.dashboard

import com.lifeline.R
import com.lifeline.view.commons.base.BaseActivity
import kotlinx.android.synthetic.main.toolbar.*

class AddAddressActivity : BaseActivity() {
    override val layout: Int
        get() = R.layout.activity_add_address

    override fun init() {
        setToolbar(toolbar, resources.getString(R.string.add_address))
    }
}