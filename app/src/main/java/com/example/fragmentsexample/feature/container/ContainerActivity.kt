package com.example.fragmentsexample.feature.container

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentsexample.R
import kotlinx.android.synthetic.main.activity_frame_layout.*

class ContainerActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)
        setSupportActionBar(toolbar)
    }
}
