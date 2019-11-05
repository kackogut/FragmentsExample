package com.example.fragmentsexample.feature.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentsexample.R
import com.example.fragmentsexample.feature.container.ContainerActivity
import com.example.fragmentsexample.feature.frame.FrameLayoutActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUIListeners()
    }

    private fun initUIListeners() {
        fragmentContainerButton.setOnClickListener {
            startActivity(Intent(this, ContainerActivity::class.java))
        }
        frameLayoutButton.setOnClickListener {
            startActivity(Intent(this, FrameLayoutActivity::class.java))
        }
    }
}
