package com.romijulianto.wordabjad.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.romijulianto.wordabjad.R
import com.romijulianto.wordabjad.adapter.WordAdapter
import com.romijulianto.wordabjad.databinding.ActivityWordBinding

class WordActivity : AppCompatActivity() {

    /* add companion object clean code to use extra abjad in other class */
    companion object {
        const val ABJAD = "abjads"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityWordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val abjadId = intent?.extras?.getString(ABJAD).toString()

        val recyclerView = binding.recyclerViewWord
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = WordAdapter(abjadId, this)

        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )

        title = getString(R.string.words_prefix) + " " + abjadId
    }
}
