package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var disp = 0

        view.findViewById<TextView>(R.id.countDisplay).setText("" + disp)

        view.findViewById<ImageButton>(R.id.action_plus).setOnClickListener {
            disp += 1
            view.findViewById<TextView>(R.id.countDisplay).setText("" + disp)
        }

        view.findViewById<ImageButton>(R.id.action_minus).setOnClickListener {
            disp -= 1
            view.findViewById<TextView>(R.id.countDisplay).setText("" + disp)
        }
    }
}