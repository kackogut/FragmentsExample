package com.example.fragmentsexample.feature.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.fragmentsexample.R
import com.example.fragmentsexample.utils.Utils
import kotlinx.android.synthetic.main.fragment_base.*

class BaseFragment(private val fragmentService: FragmentService) : Fragment() {

    private val backgroundColor = Utils.getRandomColor()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_base, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentFrameConstraintLayout.setBackgroundColor(backgroundColor)

        fragmentBaseNumberTextView.text = (++fragmentService.fragmentsCount).toString()

        fragmentFrameFirstButton.setOnClickListener {
            parentFragmentManager.commit {
                setCustomAnimations(
                    R.anim.enter_from_right,
                    R.anim.exit_to_left,
                    R.anim.enter_from_left,
                    R.anim.exit_to_right
                )
                replace<BaseFragment>(
                    R.id.fragment
                )
                addToBackStack(null)
            }
        }
    }
}
