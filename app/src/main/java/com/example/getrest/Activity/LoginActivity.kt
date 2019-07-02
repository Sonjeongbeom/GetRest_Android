package com.example.getrest.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.getrest.R
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login_signup.setOnClickListener {
            startActivity<Signup1Activity>()
        }


    }
}
