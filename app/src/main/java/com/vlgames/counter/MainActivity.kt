package com.vlgames.counter

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var minusButton: Button
    private lateinit var plusButton: Button

    private var counter: Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonToTheNextActivity.setOnClickListener {
            startActivity(Intent(this,LibraryVL::class.java))
        }

        plusButton = findViewById(R.id.plusButton)
        plusButton.setOnClickListener {
            this.countMePlus()
            if (counter % 2 == 0)
                Counter.setBackgroundColor(Color.parseColor("#FF0000"))
            else
                Counter.setBackgroundColor(Color.parseColor("#0040FF"))
        }

        minusButton = findViewById(R.id.minusButton)
        minusButton.setOnClickListener {
            this.countMeMinus()
            if (counter % 2 == 0)
                Counter.setBackgroundColor(Color.parseColor("#FF0000"))
            else
                Counter.setBackgroundColor(Color.parseColor("#0040FF"))
        }

    }


    private fun countMePlus() {
        counter++
        Counter.text = "$counter"
    }
    private fun countMeMinus() {
        counter--
        Counter.text = "$counter"
    }

}