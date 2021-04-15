package com.example.employeedetails.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.employeedetails.R
import com.example.employeedetails.fragments.SearchEmpFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
            supportFragmentManager.beginTransaction().add(R.id.frame_layout,SearchEmpFragment())
    }
}

