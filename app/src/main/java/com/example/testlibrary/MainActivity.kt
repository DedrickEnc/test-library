package com.example.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculation.calculate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var res :Int = calculate.plus(1, 3)
        println("Bonjour loooooooooooooooool")
        println(res.toString())
    }
}