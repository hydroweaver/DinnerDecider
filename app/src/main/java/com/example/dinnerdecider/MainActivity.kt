package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imageview1: ImageView
    lateinit var text_view1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.decide_button)
        val resetButton: Button = findViewById(R.id.reset_button)

        text_view1 = findViewById(R.id.text_id)
        imageview1 = findViewById(R.id.evening_image)
        var text_view1: TextView = findViewById(R.id.text_id)

        button1.setOnClickListener { chooseEveningLocation() }
        resetButton.setOnClickListener { reset() }
    }

    private fun chooseEveningLocation()  {

        val randInt = Random.nextInt(10) + 1

        val drawableResource = when (randInt) {
            1 -> R.drawable.roaster
            2 -> R.drawable.shd
            3 -> R.drawable.someplacenew
            4 -> R.drawable.ghbh
            5 -> R.drawable.thala
            6 -> R.drawable.home
            7 -> R.drawable.home2
            8 -> R.drawable.guntur
            else -> R.drawable.delivery
        }

        if (randInt == 10) {
            text_view1.text = randInt.toString()
            imageview1.setImageResource(R.drawable.confused)
        }
        else if (randInt == 1){
            text_view1.text = "I LOVE YOU GUNDU!!!"
            imageview1.setImageResource(drawableResource)
        }
        else {
            text_view1.text = randInt.toString()
            imageview1.setImageResource(drawableResource)
        }
    }

    private fun reset() {
        text_view1.text = ""
        imageview1.setImageResource(R.drawable.main_image)
    }
}
