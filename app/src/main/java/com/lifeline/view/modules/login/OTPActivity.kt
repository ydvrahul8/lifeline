package com.lifeline.view.modules.login

import com.lifeline.R
import com.lifeline.view.commons.base.BaseActivity
import kotlinx.android.synthetic.main.toolbar.*

class OTPActivity : BaseActivity() {
    override val layout: Int
        get() = R.layout.activity_o_t_p

    override fun init() {
        setToolbar(toolbar, "")
    }
}