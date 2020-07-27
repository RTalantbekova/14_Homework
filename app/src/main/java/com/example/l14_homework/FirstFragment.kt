package com.example.l14_homework

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {
    private var btnReplace : Button? = null
    private var onClick : FragmentInterface? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        onClick = context as FragmentInterface
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_first,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnReplace = view.findViewById(R.id.btnRepl)

        btnReplace?.setOnClickListener {
            onClick?.replaceFragments()
        }
    }
}