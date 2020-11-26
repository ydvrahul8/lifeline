package com.lifeline.view.modules.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lifeline.R
import com.lifeline.view.commons.base.BaseActivity
import kotlinx.android.synthetic.main.toolbar.*

class SelectCityActivity : BaseActivity() {
    override val layout: Int
        get() = R.layout.activity_select_city

    override fun init() {
  setToolbar(toolbar,"")
    }
}