package com.romijulianto.wordabjad.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.romijulianto.wordabjad.R
import com.romijulianto.wordabjad.databinding.ActivityAbjadBinding

class AbjadActivity : AppCompatActivity() {

    /* create poperty navController */
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityAbjadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* reference to nav_host */
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        setupActionBarWithNavController(navController)
    }

    /* enables back button support. Simply navigates one element up on the stack. */
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}



