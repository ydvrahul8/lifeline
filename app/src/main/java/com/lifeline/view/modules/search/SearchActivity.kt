package com.lifeline.view.modules.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lifeline.R
import com.lifeline.view.commons.base.BaseActivity
import kotlinx.android.synthetic.main.toolbar.*

class SearchActivity : BaseActivity() {
    override val layout: Int
    get() = R.layout.activity_search

    override fun init() {
        setToolbar(toolbar, resources.getString(R.string.search))
    }
}