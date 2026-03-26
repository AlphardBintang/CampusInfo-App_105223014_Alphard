package com.alphard.campusinfoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.alphard.campusinfoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Inisialisasi View Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup Navigation Component
        val navController = findNavController(R.id.nav_host_fragment)

        binding.bottomNav.setupWithNavController(navController)
    }
}