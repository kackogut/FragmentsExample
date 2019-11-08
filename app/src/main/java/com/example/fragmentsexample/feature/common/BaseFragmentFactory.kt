package com.example.fragmentsexample.feature.common

import androidx.fragment.app.FragmentFactory
import com.example.fragmentsexample.data.FragmentService

class BaseFragmentFactory(private var fragmentService: FragmentService) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String) =
        when (className) {
            BaseFragment::class.java.name -> BaseFragment(fragmentService)
            else -> super.instantiate(classLoader, className)
        }
}
