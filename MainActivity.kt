package com.example.myapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.ImageView
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var  image:ImageView
    lateinit var myButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myButton = findViewById(R.id.button)
        image = findViewById(R.id.imageView)
        myButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val dice = Dice(6)
        var numberToShow:Int = dice.rollDice()
        val imageResource:Int = when(numberToShow){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> {
                R.drawable.dice_6
            }
        }
        image.setImageResource(imageResource)
    }
        }
class Dice(val number:Int){
    fun rollDice():Int{
        return(1..number).random()
    }
}
