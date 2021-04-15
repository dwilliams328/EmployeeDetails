package com.example.employeedetails.models

import java.io.Serializable

data class User(
    var EmpID: String,
    var name: String,
    var email: String,
    var gender: String
): Serializable{
    companion object{
        const val KEY_USER = "user"
    }
}