package com.example.myapp.activity

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapp.R
import kotlinx.android.synthetic.main.login.*
import android.util.Pair as UtilPair

class MainLaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_launch_activity)

        login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            val options = ActivityOptions.makeSceneTransitionAnimation(this,
                UtilPair.create<View, String>(login, "login"))
            startActivity(intent, options.toBundle())
        }

        sign.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            val options = ActivityOptions.makeSceneTransitionAnimation(this,
                UtilPair.create<View, String>(sign, "sign"))
            startActivity(intent, options.toBundle())
        }
    }
}
