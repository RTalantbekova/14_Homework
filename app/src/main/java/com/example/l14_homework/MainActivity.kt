package com.example.l14_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), FragmentInterface{

    private var btn_Add : Button? = null
    private val fragment_first = FirstFragment()
    private val fragment_second = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        onClick()
    }

    private fun initView(){
        btn_Add = findViewById(R.id.btnAdd)
    }

    private fun onClick(){
        btn_Add?.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.frame,fragment_first)
                .commit()
        }
    }

    override fun replaceFragments() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, fragment_second)
            .commit()
    }

    override fun removeFragment() {
        supportFragmentManager
            .beginTransaction()
            .remove(fragment_second)
            .commit()
    }


}