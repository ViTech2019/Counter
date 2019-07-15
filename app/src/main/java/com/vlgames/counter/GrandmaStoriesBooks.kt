package com.vlgames.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sports_books.*

class GrandmaStoriesBooks : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports_books)
        tennis
        val tennis = findViewById<TextView>(R.id.tennis)
        tennis.setOnLongClickListener {
            Toast.makeText(this, "Daniel", Toast.LENGTH_SHORT).show()
            true
        }
        boxing
        var boxing = findViewById<TextView>(R.id.boxing)
        boxing.setOnLongClickListener {
            Toast.makeText(this, "Jimmy", Toast.LENGTH_SHORT).show()
            true
        }
        football
        var football = findViewById<TextView>(R.id.football)
        football.setOnLongClickListener {
            Toast.makeText(this, "Dima", Toast.LENGTH_SHORT).show()
            true
        }
        basketBall
        var basketBall = findViewById<TextView>(R.id.basketBall)
        basketBall.setOnLongClickListener {
            Toast.makeText(this, "Lorenco", Toast.LENGTH_SHORT).show()
            true
        }
        billiard
        var billiard = findViewById<TextView>(R.id.billiard)
        billiard.setOnLongClickListener {
            Toast.makeText(this, "Cavaly", Toast.LENGTH_SHORT).show()
            true
        }
        darts
        var darts = findViewById<TextView>(R.id.darts)
        darts.setOnLongClickListener {
            Toast.makeText(this, "Moriarty", Toast.LENGTH_SHORT).show()
            true
        }
        pingPong
        var pingPong = findViewById<TextView>(R.id.pingPong)
        pingPong.setOnLongClickListener {
            Toast.makeText(this, "MaiSu", Toast.LENGTH_SHORT).show()
            true
        }
        karate
        var karate = findViewById<TextView>(R.id.karate)
        karate.setOnLongClickListener {
            Toast.makeText(this, "Chiko", Toast.LENGTH_SHORT).show()
            true
        }
        atletics
        var atletics = findViewById<TextView>(R.id.atletics)
        atletics.setOnLongClickListener {
            Toast.makeText(this, "Bamby", Toast.LENGTH_SHORT).show()
            true
        }
        jumping
        var jumping = findViewById<TextView>(R.id.jumping)
        jumping.setOnLongClickListener {
            Toast.makeText(this, "Boby", Toast.LENGTH_SHORT).show()
            true
        }
        dancing
        var dancing = findViewById<TextView>(R.id.dancing)
        dancing.setOnLongClickListener {
            Toast.makeText(this, "Lace", Toast.LENGTH_SHORT).show()
            true
        }
        salta
        var salta = findViewById<TextView>(R.id.salta)
        salta.setOnLongClickListener {
            Toast.makeText(this, "Booboo", Toast.LENGTH_SHORT).show()
            true
        }
        games
        var games = findViewById<TextView>(R.id.games)
        games.setOnLongClickListener {
            Toast.makeText(this, "Biibii", Toast.LENGTH_SHORT).show()
            true
        }
        kickBox
        var kickBox = findViewById<TextView>(R.id.kickBox)
        kickBox.setOnLongClickListener {
            Toast.makeText(this, "Baby", Toast.LENGTH_SHORT).show()
            true
        }
        fastWalking
        var fastWalking = findViewById<TextView>(R.id.fastWalking)
        fastWalking.setOnLongClickListener {
            Toast.makeText(this, "Kooko", Toast.LENGTH_SHORT).show()
            true
        }
    }
}
