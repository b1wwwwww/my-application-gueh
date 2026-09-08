package com.example.my_first_application

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class KalkulatorFragment : Fragment(R.layout.fragment_kalkulator) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val input1 = view.findViewById<EditText>(R.id.input1)
        val input2 = view.findViewById<EditText>(R.id.input2)
        val hasil = view.findViewById<TextView>(R.id.hasil)

        fun calculate(operation: (Double, Double) -> Double) {
            val num1Str = input1.text.toString()
            val num2Str = input2.text.toString()

            if (num1Str.isEmpty() || num2Str.isEmpty()) {
                hasil.text = "Error: Masukkan angka"
                return
            }

            try {
                val num1 = num1Str.toDouble()
                val num2 = num2Str.toDouble()
                val res = operation(num1, num2)
                hasil.text = if (res % 1 == 0.0) res.toInt().toString() else res.toString()
            } catch (e: Exception) {
                hasil.text = "Error: Input salah"
            }
        }

        view.findViewById<Button>(R.id.btntambah).setOnClickListener { calculate { a, b -> a + b } }
        view.findViewById<Button>(R.id.btnkurang).setOnClickListener { calculate { a, b -> a - b } }
        view.findViewById<Button>(R.id.btnkali).setOnClickListener { calculate { a, b -> a * b } }
        view.findViewById<Button>(R.id.btnbagi).setOnClickListener { 
            val n2 = input2.text.toString().toDoubleOrNull()
            if (n2 == 0.0) hasil.text = "Error: Bagi nol"
            else calculate { a, b -> a / b }
        }
    }
}