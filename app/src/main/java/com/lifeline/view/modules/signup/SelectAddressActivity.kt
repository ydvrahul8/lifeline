package com.lifeline.view.modules.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lifeline.R
import com.lifeline.view.commons.base.BaseActivity
import kotlinx.android.synthetic.main.activity_select_address.*
import kotlinx.android.synthetic.main.toolbar.*

class SelectAddressActivity : BaseActivity() {
    override val layout: Int
        get() = R.layout.activity_select_address

    override fun init() {
        imageView_back_button.setOnClickListener { finish() }
    }
}