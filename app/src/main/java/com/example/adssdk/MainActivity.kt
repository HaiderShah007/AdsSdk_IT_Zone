package com.example.adssdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itzone.adshelper.FunctionUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FunctionUtils().addUser("haider","12345")
    }
}