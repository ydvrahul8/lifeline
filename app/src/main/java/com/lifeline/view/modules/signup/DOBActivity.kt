package com.lifeline.view.modules.signup

import androidx.core.text.HtmlCompat
import com.lifeline.R
import com.lifeline.view.commons.base.BaseActivity
import kotlinx.android.synthetic.main.activity_d_o_b.*
import kotlinx.android.synthetic.main.toolbar.*


class DOBActivity : BaseActivity() {
    override val layout: Int
        get() = R.layout.activity_d_o_b

    override fun init() {
        setToolbar(toolbar, "")
        val text =
            "<font color=#000000>By continuing i agree to the </font>" +
                    " <font color=#FF3232>terms and conditions</font>" +
                    " <font color=#000000> of Life Line</font>"
        textView_tnc.text = HtmlCompat.fromHtml(text, HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}