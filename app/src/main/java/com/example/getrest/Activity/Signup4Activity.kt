package com.example.getrest.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.getrest.R
import kotlinx.android.synthetic.main.activity_signup4.*
import kotlinx.android.synthetic.main.toolbar_signup2.*
import org.jetbrains.anko.startActivity

class Signup4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup4)

        img_toolbar_signup2_back.setOnClickListener {
            finish()
        }

        btn_signup4_submit.setOnClickListener {
            startActivity<MainActivity>()
        }
    }
}
