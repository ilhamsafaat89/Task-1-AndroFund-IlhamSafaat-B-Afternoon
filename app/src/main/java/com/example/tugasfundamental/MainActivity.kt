package com.example.tugasfundamental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.welcome)

        val welcome = intent.getParcelableExtra<User>("User")?.username

        tv.text = "Welcome, $welcome"

        val btnHome : Button = findViewById(R.id.btn_home)
        btnHome.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_home ->{
                val onclick = Intent(this@MainActivity, OrderAcitivity::class.java)
                startActivity(onclick)
            }
        }
    }
}