package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivitySecoundBirdBinding
import com.squareup.picasso.Picasso

class SecoundBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecoundBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecoundBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnPrev = findViewById<ImageView>(R.id.btnPrev)
        val btnNext2 = findViewById<ImageView>(R.id.btnNext2)

        btnPrev.setOnClickListener {
            finish()
        }

        btnNext2.setOnClickListener{
            val intent = Intent (this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1539517340432-0f1acc7916d6?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8aW1hZ2VzJTIwb2YlMjBiaXJkfGVufDB8fDB8fHww").centerCrop().resize(500,500).into(binding.imageView22)



    }

}