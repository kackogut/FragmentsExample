package com.example.fragmentsexample.feature.common

import androidx.fragment.app.FragmentFactory

class BaseFragmentFactory : FragmentFactory() {

    private var fragmentService = FragmentService()

    override fun instantiate(classLoader: ClassLoader, className: String) =
        when (className) {
            BaseFragment::class.java.name -> BaseFragment(fragmentService)
            else -> super.instantiate(classLoader, className)
        }
}
