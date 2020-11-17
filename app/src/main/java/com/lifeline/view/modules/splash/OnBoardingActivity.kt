package com.lifeline.view.modules.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lifeline.preferences.UserPreferences
import com.lifeline.R
import com.lifeline.view.modules.dashboard.DashBoardActivity
import com.lifeline.view.modules.login.LoginActivity
import kotlinx.coroutines.*


class OnBoardingActivity : AppCompatActivity() {
    private val activityScope = CoroutineScope(Dispatchers.Main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.MyTheme)
        setContentView(R.layout.activity_on_boarding)
        activityScope.launch {
            delay(1000)

            if (UserPreferences().isLoggedIn(this@OnBoardingActivity)) {
                startActivity(Intent(this@OnBoardingActivity, DashBoardActivity::class.java))
            } else {
                startActivity(Intent(this@OnBoardingActivity, LoginActivity::class.java))
            }
            finish()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }
}
