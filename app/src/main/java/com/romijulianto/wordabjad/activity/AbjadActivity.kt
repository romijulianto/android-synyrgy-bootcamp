package com.romijulianto.wordabjad.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.romijulianto.wordabjad.R
import com.romijulianto.wordabjad.adapter.AbjadAdapter
import com.romijulianto.wordabjad.databinding.ActivityAbjadBinding

class AbjadActivity : AppCompatActivity() {
    /* track layout default */
    private var isLinearLayoutManager = true

    /* initiate variable binding recyclerview */
    private lateinit var recyclerView: RecyclerView

    /* method onCreate */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abjad)

        val binding = ActivityAbjadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerviewAbjad
        // Sets the LinearLayoutManager of the recyclerview
        chooseLayout()
    }

    /* create function and condition ChooseLayout */
    private fun chooseLayout() {
        if (isLinearLayoutManager) {
            recyclerView.layoutManager = LinearLayoutManager(this)
        } else {
            recyclerView.layoutManager = GridLayoutManager(this, 2)
        }
        recyclerView.adapter = AbjadAdapter()
    }

    /* create function setIcon Boolean */
    private fun setIcon(menuItem: MenuItem?) {
        if (menuItem == null)
            return

        menuItem.icon =
            if (isLinearLayoutManager)
                ContextCompat.getDrawable(this, R.drawable.ic_grid_view)
            else ContextCompat.getDrawable(this, R.drawable.ic_list_view)
    }

    /* create function onCreateOptionsmenu */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)

        val layoutButton = menu?.findItem(R.id.it_switch_menu)
        setIcon(layoutButton)
        return true
    }

    /* create optionsMenu */

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.it_switch_menu -> {
                isLinearLayoutManager = !isLinearLayoutManager

                chooseLayout()
                setIcon(item)

                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
