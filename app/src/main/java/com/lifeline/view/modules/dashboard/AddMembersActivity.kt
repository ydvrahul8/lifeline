package com.lifeline.view.modules.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lifeline.R
import com.lifeline.view.commons.base.BaseActivity
import kotlinx.android.synthetic.main.toolbar.*

class AddMembersActivity : BaseActivity() {
    override val layout: Int
        get() = R.layout.activity_add_members

    override fun init() {
        setToolbar(toolbar,resources.getString(R.string.add_patient))
    }
}