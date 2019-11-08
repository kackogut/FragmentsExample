package com.example.fragmentsexample.feature.fragment_old

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentsexample.R
import com.example.fragmentsexample.data.FragmentService
import com.example.fragmentsexample.feature.common.BaseFragmentFactory
import kotlinx.android.synthetic.main.activity_fragment_old.*

class FragmentOldActivity : AppCompatActivity() {
    private var fragmentService = FragmentService()

    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory = BaseFragmentFactory(fragmentService)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_old)
        setSupportActionBar(toolbar)
    }
}
