package com.example.pdm1_aula06_exemplo1_viewbinding

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.pdm1_aula06_exemplo1_viewbinding.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    //private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.textView.text = "Olá, View Binding!"
        }
    }
}