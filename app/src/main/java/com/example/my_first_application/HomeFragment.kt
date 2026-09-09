package com.example.my_first_application

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.my_first_application.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Siapkan data dummy
        val daftarSiswa = listOf(
            Siswa("Rizqi Pratama", "XII RPL 1", 88),
            Siswa("Muhamad Alghani", "XII RPL 1", 92),
            Siswa("Nazril Fahrezi", "XII RPL 1", 79),
            Siswa("Aqilah kukuk", "XII RPL 1", 85),
            Siswa("Fauzan Zhahir", "XII RPL 1", 90)
        )

        // 2. Buat Adapter
        val adapter = SiswaAdapter(daftarSiswa) { siswaDipilih ->
            // Aksi saat item diklik: Tampilkan Toast
            Toast.makeText(context, "Kamu memilih: ${siswaDipilih.nama}", Toast.LENGTH_SHORT).show()
        }

        // 3. Atur RecyclerView
        binding.rvSiswa.layoutManager = LinearLayoutManager(context)
        binding.rvSiswa.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}