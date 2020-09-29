package com.internshala.activitylifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    lateinit var etEnterName : EditText
    lateinit var etEnterEmail : EditText
    lateinit var etEnterPassword : EditText
    lateinit var btnCreate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etEnterName = findViewById(R.id.etEnterName)
        etEnterEmail = findViewById(R.id.etEnterEmail)
        etEnterPassword = findViewById(R.id.etEnterPassword)
        btnCreate = findViewById(R.id.btnCreate)

        btnCreate.setOnClickListener{
            Toast.makeText(this@RegisterActivity,"Account Created", Toast.LENGTH_LONG).show()

        }
    }
}
