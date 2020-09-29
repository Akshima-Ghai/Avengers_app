package com.internshala.activitylifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ForgotPasswordActivity : AppCompatActivity() {

    lateinit var etSubmit :EditText
    lateinit var btnForgot :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        etSubmit = findViewById(R.id.etSubmit)
        btnForgot = findViewById(R.id.btnForgot)

        btnForgot.setOnClickListener{
            Toast.makeText(this@ForgotPasswordActivity,"Email Sent",Toast.LENGTH_LONG).show()

        }
    }
}
