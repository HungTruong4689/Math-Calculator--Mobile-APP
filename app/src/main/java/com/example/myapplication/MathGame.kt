package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MathGame : AppCompatActivity() {
    var addition : Button? =null
    var substraction : Button? =null
    var multi : Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_game)

        addition = findViewById(R.id.addition)
        substraction = findViewById(R.id.substraction)
        multi = findViewById(R.id.multiplication)

        addition!!.setOnClickListener{
            var i: Intent? = null
            i = Intent(this@MathGame,Addition::class.java)
            startActivity(i)
            finish()
        }
        substraction!!.setOnClickListener{
            var i: Intent? = null
            i = Intent(this@MathGame,Substraction::class.java)
            startActivity(i)
            finish()
        }
        multi!!.setOnClickListener{
            var i: Intent? = null
            i = Intent(this@MathGame,Multiplication::class.java)
            startActivity(i)
            finish()
        }
    }
}