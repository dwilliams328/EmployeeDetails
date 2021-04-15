package com.example.employeedetails.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.employeedetails.R
import com.example.employeedetails.activities.DetailsActivity
import com.example.employeedetails.models.User
import kotlinx.android.synthetic.main.fragment_search_emp.*
import kotlinx.android.synthetic.main.fragment_search_emp.view.*

class SearchEmpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_search_emp, container, false)

        init(view)

        return view
    }

    private fun init(view: View) {

        view.button_send.setOnClickListener {
            var empID = edit_view_empid.text.toString()
            var name = edit_view_name.text.toString()
            var email = edit_view_email.text.toString()
            var gender = edit_view_gender.text.toString()
            var user = User(empID,name,email,gender)
            var intent = Intent(context,DetailsActivity::class.java)

            var bundle = Bundle()



            //can't do this.. need to learn how to handle bundles better.
            bundle.putBundle("DATA",user)

            startActivity(intent)

        }

    }

}