package com.example.gastoviagem

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.gastoviagem.databinding.MainBinding

class MainActivity : ComponentActivity() {
    lateinit var binding : MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {
            calculate()
        }
    }

    private fun calculate() {
        Toast.makeText(this, "Calculado", Toast.LENGTH_LONG).show()
    }
}
