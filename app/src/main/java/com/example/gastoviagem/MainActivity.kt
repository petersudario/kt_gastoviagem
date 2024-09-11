package com.example.gastoviagem

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.gastoviagem.databinding.MainBinding

class MainActivity : ComponentActivity() {
    lateinit var binding : MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
