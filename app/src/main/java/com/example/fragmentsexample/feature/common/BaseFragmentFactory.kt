package com.example.fragmentsexample.feature.common

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

class BaseFragmentFactory : FragmentFactory(){

    override fun instantiate(classLoader: ClassLoader, className: String) =
        when(className){
            BaseFragment::class.java.name -> BaseFragment()
            else -> super.instantiate(classLoader, className)
        }
}
