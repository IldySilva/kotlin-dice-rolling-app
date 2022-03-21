package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

     lateinit var  diceResult:ImageView;


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()

        setContentView(R.layout.activity_main)
        val rollButton:Button=findViewById(R.id.roll_button)

        rollButton.text="Let's Roll"
        rollButton.setBackgroundColor(0xff008279.toInt())
        rollButton.setOnClickListener(){
           rollDice()
        }

diceResult=findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val drawableResource=when(Random.nextInt(1,6)){
1-> R.drawable.dice_1
          2->R.drawable.dice_2
          3->R.drawable.dice_3
          4->R.drawable.dice_4
              5->R.drawable.dice_5
          6->R.drawable.dice_6
          else -> R.drawable.empty_dice
      }
      diceResult.setImageResource(drawableResource);
    }
}