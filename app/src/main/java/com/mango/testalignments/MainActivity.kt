package com.mango.testalignments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var btnt1 : ImageButton
    private lateinit var btnt2: ImageButton
    private lateinit var btnt3: ImageButton
    private lateinit var explain:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnt1 = findViewById(R.id.btnt1)
        btnt2 = findViewById(R.id.btnt2)
        btnt3 = findViewById(R.id.btnt3)
        explain = findViewById(R.id.explain)


        btnt1.setOnClickListener {
            println("learnThai ImageButton is working")
            val intent = Intent(this, ThaiBtns::class.java)
            startActivity(intent)
        }
        btnt2.setOnClickListener {
            println("learnThai ImageButton is working")
            val intent = Intent(this, ThaiBtns::class.java)
            startActivity(intent)
        }
        btnt3.setOnClickListener {
            println("learnThai ImageButton is working")
            val intent = Intent(this, ThaiBtns::class.java)
            startActivity(intent)
        }
    }
}