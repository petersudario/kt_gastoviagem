package com.example.gastoviagem

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.gastoviagem.databinding.MainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding : MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {
            calculate()
        }
    }

    private fun isValid() : Boolean {
        return binding.editDistance.text.isNotEmpty() &&
                binding.editPrice.text.isNotEmpty() &&
                binding.editAutonomy.text.isNotEmpty() &&
                binding.editAutonomy.text.toString().toFloat() > 0
    }

    private fun calculate() {

        if (!isValid()) {
            Toast.makeText(this, R.string.fill_all_fields, Toast.LENGTH_SHORT).show()
            return
        }

        val distance = binding.editDistance.text.toString().toFloat()
        val price = binding.editPrice.text.toString().toFloat()
        val autonomy = binding.editAutonomy.text.toString().toFloat()

        val totalValue = (distance * price) / autonomy

        binding.textTotalSpentValue.text = "R$ ${"%.2f".format(totalValue)}"

        Toast.makeText(this, "R$ ${"%.2f".format(totalValue)}", Toast.LENGTH_SHORT).show()
    }
}
