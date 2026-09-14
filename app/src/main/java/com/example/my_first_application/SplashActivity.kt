package com.example.my_first_application

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.my_first_application.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private val SPLASH_DELAY: Long = 2000 // 2 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            val sharedPref = getSharedPreferences("AppPrefs", MODE_PRIVATE)
            val isLoggedIn = sharedPref.getBoolean("IS_LOGGED_IN", false)

            // jika sudah login, langsung ke MainActivity, dan jika belum ke LoginActivity dlu
            val tujuan = if (isLoggedIn) MainActivity::class.java else LoginActivity::class.java
            startActivity(Intent(this, tujuan))
            finish()
        }, SPLASH_DELAY)
    }
}