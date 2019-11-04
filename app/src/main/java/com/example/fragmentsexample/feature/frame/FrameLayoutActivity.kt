package com.example.fragmentsexample.feature.frame

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentsexample.R

import kotlinx.android.synthetic.main.activity_frame_layout.*

class FrameLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)
        setSupportActionBar(toolbar)
    }

}
