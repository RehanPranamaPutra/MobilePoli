package com.rehan.politeknik

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Geleri : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_geleri)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Get the ImageView in the layout
        val imageView: ImageView = findViewById(R.id.fullscreen_image)

        // Get the image resource ID passed from the previous activity
        val imageResId = intent.getIntExtra("imageResId", -1)

        // Set the image in the ImageView
        if (imageResId != -1) {
            imageView.setImageResource(imageResId)
        }
    }
}