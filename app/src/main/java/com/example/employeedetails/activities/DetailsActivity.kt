package com.example.employeedetails.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import com.example.employeedetails.R
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.fragment_search_emp.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        init()
    }

    private fun init() {


        var bundle = intent.getBundleExtra("DATA")

        var empID = bundle?.getString("empID")
        var name = bundle?.getString("NAME")
        var email = bundle?.getString("EMAIL")
        var gender = bundle?.getString("GENDER")

        text_view_empid.text = "$empID"
        text_view_name.text = "$name"
        text_view_email.text = "$email"
        text_view_gender.text = "$gender"

    }
}