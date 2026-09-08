package com.example.my_first_application

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.my_first_application.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val DUMMY_USERNAME = "Nabil"
    private val DUMMY_PASSWORD = "280856"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            when {
                username.isEmpty() || password.isEmpty() -> {
                    Toast.makeText(this, "Username dan password wajib diisi", Toast.LENGTH_SHORT).show()
                }
                username == DUMMY_USERNAME && password == DUMMY_PASSWORD -> {
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("USERNAME", username)
                    startActivity(intent)
                    finish()
                }
                else -> {
                    Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}