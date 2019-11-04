package com.example.fragmentsexample.feature.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentsexample.R
import com.example.fragmentsexample.feature.frame.FrameLayoutActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUIListeners()
    }

    private fun initUIListeners(){
        fragmentContainerButton.setOnClickListener {

        }
        frameLayoutButton.setOnClickListener {
            startActivity(Intent(this,FrameLayoutActivity::class.java))
        }
    }
}
