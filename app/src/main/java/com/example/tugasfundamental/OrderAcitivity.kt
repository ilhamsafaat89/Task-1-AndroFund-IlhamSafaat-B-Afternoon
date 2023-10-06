package com.example.tugasfundamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OrderAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_acitivity)

        val btnProses:Button = findViewById(R.id.proses)
        val btnDikirim:Button = findViewById(R.id.dikirim)

        btnProses.setOnClickListener{
            val fragment1 = Fragment_1()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,fragment1)
                .commit()
        }

        btnDikirim.setOnClickListener{
            val fragment2 = Fragment_2()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,fragment2)
                .commit()
        }
    }
}