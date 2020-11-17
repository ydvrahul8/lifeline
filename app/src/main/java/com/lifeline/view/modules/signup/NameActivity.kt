package com.lifeline.view.modules.signup

import com.lifeline.R
import com.lifeline.view.commons.base.BaseActivity
import kotlinx.android.synthetic.main.toolbar.*

class NameActivity : BaseActivity() {
    override val layout: Int
        get() = R.layout.activity_name

    override fun init() {
        setToolbar(toolbar,"")
    }
}