package com.example.fragmentsexample.feature.frame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentsexample.R
import kotlinx.android.synthetic.main.fragment_frame_layout_first.*

/**
 * A placeholder fragment containing a simple view.
 */
class FrameLayoutActivityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_frame_layout_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentFrameFirstButton.setOnClickListener {
            val fragment = FrameLayoutActivitySecondFragment()
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragment, fragment)
                ?.addToBackStack(null)
                ?.commit()
        }
    }
}
