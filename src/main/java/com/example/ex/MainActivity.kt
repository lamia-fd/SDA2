package com.example.ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var move=findViewById<Button>(R.id.move)
        var text1= findViewById<EditText>(R.id.name).text
        var text2=findViewById<EditText>(R.id.location).text
        var text3=findViewById<EditText>(R.id.phone).text
        var toa=findViewById<Button>(R.id.toa)
        var tv=findViewById<Button>(R.id.tv)
        var text=findViewById<TextView>(R.id.textView)

       // var name=text1.text
       // var location=text2.text
       // var phone=text3.text

        move.setOnClickListener {
           var intent=Intent(this,MainActivity2::class.java)
            intent.putExtra(MainActivity2.Name,text1)
            intent.putExtra(MainActivity2.Location,text2)
            intent.putExtra(MainActivity2.Phone,text3)
            startActivity(intent)

        }
        toa.setOnClickListener {
            Toast.makeText(applicationContext,"name:$text1 location:$text2 phone: $text3",Toast.LENGTH_LONG).show()

        }
        tv.setOnClickListener {
            text.setText("name:$text1 location:$text2 phone: $text3")

        }
    }
}