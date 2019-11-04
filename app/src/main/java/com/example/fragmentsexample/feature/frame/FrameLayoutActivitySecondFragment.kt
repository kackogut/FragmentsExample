package com.example.fragmentsexample.feature.frame

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsexample.R

/**
 * A placeholder fragment containing a simple view.
 */
class FrameLayoutActivitySecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_frame_layout_second, container, false)
    }
}
