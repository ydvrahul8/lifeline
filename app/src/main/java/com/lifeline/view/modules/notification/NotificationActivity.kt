package com.lifeline.view.modules.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lifeline.R
import com.lifeline.view.commons.base.BaseActivity
import kotlinx.android.synthetic.main.toolbar.*

class NotificationActivity : BaseActivity() {
    override val layout: Int
        get() = R.layout.activity_notification

    override fun init() {
        setToolbar(toolbar, resources.getString(R.string.notifications))
    }
}