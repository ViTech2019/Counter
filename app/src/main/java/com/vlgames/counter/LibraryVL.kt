package com.vlgames.counter

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_library_vl.*
import kotlinx.android.synthetic.main.activity_main.*

class LibraryVL : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library_vl)

        cooking.setOnClickListener {
            startActivity(Intent(this,CookingBooks::class.java))
        }
        grandmaStories.setOnClickListener {
            startActivity(Intent(this,GrandmaStoriesBooks::class.java))
        }
        Math.setOnClickListener {
            startActivity(Intent(this,MathBooks::class.java))
        }
        Dictionary.setOnClickListener {
            startActivity(Intent(this,DictionaryBooks::class.java))
        }
        Srort.setOnClickListener {
            startActivity(Intent(this,SportsBooks::class.java))
        }
    }
}
