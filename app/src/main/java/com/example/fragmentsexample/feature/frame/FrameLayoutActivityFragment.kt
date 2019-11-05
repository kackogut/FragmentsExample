package com.example.fragmentsexample.feature.frame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentsexample.R
import com.example.fragmentsexample.utils.Utils
import kotlinx.android.synthetic.main.fragment_frame_layout.*

/**
 * A placeholder fragment containing a simple view.
 */
class FrameLayoutActivityFragment : Fragment() {

    private val backgroundColor = Utils.getRandomColor()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_frame_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentFrameConstraintLayout.setBackgroundColor(backgroundColor)
        fragmentFrameFirstButton.setOnClickListener {
            fragmentManager?.beginTransaction()
                ?.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left)
                ?.replace(R.id.fragment, FrameLayoutActivityFragment())
                ?.addToBackStack(null)
                ?.commit()
        }
    }
}
