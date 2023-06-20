package com.example.signuplogin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)

        binding.registerButton.setOnClickListener {
            val username = binding.username.toString()
            val phone = binding.phoneNumber.toString()
            val email = binding.email.toString()
            val password = binding.password.toString()

            if (isValidUsername(username) && isValidPhone(phone) && isValidEmail(email) && isValidPassword(password)) {
                } else {
            }
        }
    }

    private fun isValidUsername(username: String): Boolean {
        return (isValidUsername(username)
    }

    private fun isValidPhone(phone: String): Boolean {
        return isValidPhone(phone)
    }

    private fun isValidEmail(email: String): Boolean {
        isValidEmail(email)
    }

    private fun isValidPassword(password: String): Boolean {
        return isValidPassword(password)
    }
}
