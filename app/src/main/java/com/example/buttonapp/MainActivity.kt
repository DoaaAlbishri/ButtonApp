package com.example.buttonapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var textview : TextView
    lateinit var sub : Button
    lateinit var sum : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview = findViewById(R.id.textView)
        sub = findViewById(R.id.button)
        sum = findViewById(R.id.button2)

        textview.setTextColor(Color.rgb(0, 0, 0))


        sub.setOnClickListener {
            var op = -1
            btn(op)
        }
        sum.setOnClickListener {
            var op = 1
            btn(op)

        }
    }

        fun btn(op: Int){
            var num = textview.text.toString()

            if(op==-1){
                textview.text = "${num.toInt()-1}"
                textview.translationY= 100F

                var num = textview.text.toString()
                if(num.toInt()>0){
                    textview.setTextColor(Color.rgb(36, 161, 30))
                } else if(num.toInt()==0){
                    textview.setTextColor(Color.rgb(0, 0, 0))
                }else{
                    textview.setTextColor(Color.rgb(221, 35, 35))
                }
            }
            else{
                textview.text = "${num.toInt()+1}"

                textview.translationY= -100F

                var num = textview.text.toString()
                if(num.toInt()>0){
                    textview.setTextColor(Color.rgb(36, 161, 30))
                } else if(num.toInt()==0){
                    textview.setTextColor(Color.rgb(0, 0, 0))
                }else{
                    textview.setTextColor(Color.rgb(221, 35, 35))
                }
            }
        }


    }