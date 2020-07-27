package com.example.l14_homework

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {
    private var btnRemove : Button? = null
    private var onClicked : FragmentInterface? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        onClicked = context as FragmentInterface
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnRemove = view.findViewById(R.id.btnRemv)

        btnRemove?.setOnClickListener {
            onClicked?.removeFragment()
        }
    }
}