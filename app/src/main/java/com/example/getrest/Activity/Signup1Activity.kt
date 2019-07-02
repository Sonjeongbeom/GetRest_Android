package com.example.getrest.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.getrest.R
import kotlinx.android.synthetic.main.activity_signup1.*
import org.jetbrains.anko.startActivity

class Signup1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup1)

        btn_signup1_next.setOnClickListener {
            startActivity<Signup2Activity>()
        }

    }
}
