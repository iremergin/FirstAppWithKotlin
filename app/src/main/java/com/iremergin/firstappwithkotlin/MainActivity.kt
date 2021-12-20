package com.iremergin.firstappwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var rollBtn: Button = findViewById(R.id.RollDiceButton)
        var diceText: TextView = findViewById(R.id.selamlaText)
        var diceImage: ImageView = findViewById(R.id.DiceImage)

        rollBtn.setOnClickListener {

            var randomNumber: Int = (1..6).random()

            diceText.text = randomNumber.toString()




            Toast.makeText(this, "Zar Değeriniz $randomNumber", Toast.LENGTH_SHORT).show()


            when (randomNumber) {
                1 -> diceImage.setImageResource(R.drawable.dice_1)
                2 -> diceImage.setImageResource(R.drawable.dice_2)
                3 -> diceImage.setImageResource(R.drawable.dice_3)
                4 -> diceImage.setImageResource(R.drawable.dice_4)
                5 -> diceImage.setImageResource(R.drawable.dice_5)
                else -> diceImage.setImageResource(R.drawable.dice_6)
            }

        }
    }
}