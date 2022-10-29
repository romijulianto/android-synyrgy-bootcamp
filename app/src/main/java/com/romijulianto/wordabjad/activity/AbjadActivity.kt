package com.romijulianto.wordabjad.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.romijulianto.wordabjad.R
import com.romijulianto.wordabjad.adapter.AbjadAdapter
import com.romijulianto.wordabjad.databinding.ActivityAbjadBinding

class AbjadActivity : AppCompatActivity() {

    /* initiate variable binding recyclerview */
    private lateinit var recyclerView: RecyclerView

    /* method onCreate */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abjad)

        val binding = ActivityAbjadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerviewAbjad
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AbjadAdapter()
        
    }
}