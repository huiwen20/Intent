package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSend.setOnClickListener {
            //Create an Explicit intent.
            //Two parameters(this, Component Name)
            val intent = Intent(this, SecondActivity::class.java)

            val phone = editTextPhone.text.toString()
            intent.putExtra(EXTRA_PHONE, phone)
            startActivity(intent)

        }
    }

    companion object {
        //use package name to ensure unique value, com.example.intent
        const val EXTRA_PHONE = "com.example.intent.PHONE"
    }

}//End of class
