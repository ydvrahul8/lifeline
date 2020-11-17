package com.lifeline.view.modules.signup

import android.R.attr.button
import android.content.Intent
import android.widget.ArrayAdapter
import com.lifeline.R
import com.lifeline.view.commons.base.BaseActivity
import kotlinx.android.synthetic.main.activity_gender.*
import kotlinx.android.synthetic.main.toolbar.*


class GenderActivity : BaseActivity() {
    override val layout: Int
        get() = R.layout.activity_gender

    override fun init() {
        setToolbar(toolbar, "")
        val dataAdapter: ArrayAdapter<CharSequence> =
            ArrayAdapter.createFromResource(
                this,
                R.array.gender,
                R.layout.item_spinner
            )
        // attaching data adapter to spinner
        spinner.adapter = dataAdapter

    }
}