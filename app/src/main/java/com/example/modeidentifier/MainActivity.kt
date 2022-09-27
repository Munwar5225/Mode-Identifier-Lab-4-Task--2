package com.example.modeidentifier

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image: ImageView = findViewById(R.id.image)
        val text1: TextView = findViewById(R.id.Text)
        val name: EditText = findViewById(R.id.name)
        val button: Button = findViewById(R.id.button)
        val linearLayout1: LinearLayout = findViewById(R.id.firstLayout)
        val linearLayout2: LinearLayout = findViewById(R.id.seconfLayout)
        linearLayout2.visibility = View.INVISIBLE

            button.setOnClickListener {
                if (name.text.toString().isEmpty()) {
                    Toast.makeText(this, "Please Type your Name", Toast.LENGTH_LONG).show()
                }
                else {
                val random = (0..12).random()
                linearLayout2.visibility = View.VISIBLE
                linearLayout1.visibility = View.GONE
                when (random) {
                    0 -> image.setImageResource(R.drawable.angry)
                    1 -> image.setImageResource(R.drawable.deppressed)
                    2 -> image.setImageResource(R.drawable.disappointed)
                    3 -> image.setImageResource(R.drawable.happy)
                    4 -> image.setImageResource(R.drawable.one_eyebrow)
                    5 -> image.setImageResource(R.drawable.slightly_happy)
                    6 -> image.setImageResource(R.drawable.suffering)
                    7 -> image.setImageResource(R.drawable.thinking)
                    8 -> image.setImageResource(R.drawable.tuck_out_tongue)
                    9 -> image.setImageResource(R.drawable.unhappy)
                    10 -> image.setImageResource(R.drawable.upside_down)
                    11 -> image.setImageResource(R.drawable.worried)
                }
                when (random) {
                    0 -> text1.text = "Angry"
                    1 -> text1.text = "Depressed"
                    2 -> text1.text = "Disappointed"
                    3 -> text1.text = "Happy"
                    4 -> text1.text = "Anything crazy happened."
                    5 -> text1.text = "Normal Mood"
                    6 -> text1.text = "Suffering "
                    7 -> text1.text = "Thinking About Future"
                    8 -> text1.text = "Funny Mood"
                    9 -> text1.text = "Unhappy"
                    10 -> text1.text = "Something that went wrong"
                    11 -> text1.text = "Worried"
                }
            }

        }
    }
}