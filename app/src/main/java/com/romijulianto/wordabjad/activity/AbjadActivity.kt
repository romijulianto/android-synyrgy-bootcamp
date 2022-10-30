package com.romijulianto.wordabjad.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.romijulianto.wordabjad.databinding.ActivityAbjadBinding

class AbjadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityAbjadBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

