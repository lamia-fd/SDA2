package com.example.ex

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
 companion object{
     const val Name="Name"
     const val Location="Location"
     const val Phone="Phone"
 }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var output=findViewById<TextView>(R.id.textView2)
        var name=intent.getStringExtra(Name).toString()
        var location=intent.getStringExtra(Location).toString()
        var phone=intent.getStringExtra(Phone).toString()

        output.text = "name:$name locaton:$location phone: $phone"


    }
}