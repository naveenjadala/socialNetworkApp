package com.example.myapp.activity

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Pair
import android.view.View
import com.example.myapp.R
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.view.*
import kotlinx.android.synthetic.main.login.view.forgot_password

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        forgot_password.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            val options = ActivityOptions.makeSceneTransitionAnimation(this,
                Pair.create<View, String>(forgot_password, getString(R.string.forgot_password)))
            startActivity(intent, options.toBundle())
        }
    }
}
