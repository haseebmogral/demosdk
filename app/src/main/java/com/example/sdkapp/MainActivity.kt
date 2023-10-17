package com.example.sdkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.demosdk.Toaster

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toaster = Toaster()

        toaster.showToast(this,"Hello from another world!!!")
        Toast.makeText(this,"hellow",Toast.LENGTH_SHORT).show()
    }
}