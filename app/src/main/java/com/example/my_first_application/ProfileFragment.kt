package com.example.my_first_application

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Tombol GitHub
        val btnGithub = view.findViewById<Button>(R.id.btnGithub)
        btnGithub.setOnClickListener {
            openUrl("https://github.com/b1wwwwww")
        }

        // Tombol Instagram
        val btnInstagram = view.findViewById<Button>(R.id.btnInstagram)
        btnInstagram.setOnClickListener {
            openUrl("https://www.instagram.com/abilll2312/")
        }

        // Tombol Logout
        val btnLogout = view.findViewById<Button>(R.id.btnLogoutFragment)
        btnLogout.setOnClickListener {
            // 1. Hapus semua data session di SharedPreferences
            val sharedPref = requireActivity().getSharedPreferences("AppPrefs", android.content.Context.MODE_PRIVATE)
            sharedPref.edit().clear().apply()

            // 2. Baru kemudian pindah ke LoginActivity
            val intent = Intent(requireActivity(), LoginActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
