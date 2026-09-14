package com.example.my_first_application

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class StudentFragment : Fragment(R.layout.fragment_student) {

    private lateinit var db: AppDatabase

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        db = DatabaseProvider.getDatabase(requireContext())

        val etNama = view.findViewById<EditText>(R.id.etNama)
        val etKelas = view.findViewById<EditText>(R.id.etKelas)
        val etNilai = view.findViewById<EditText>(R.id.etNilai)
        val btnSimpan = view.findViewById<Button>(R.id.btnSimpan)
        val rvSiswa = view.findViewById<RecyclerView>(R.id.rvSiswaRoom)

        rvSiswa.layoutManager = LinearLayoutManager(context)

        fun loadData() {
            lifecycleScope.launch {
                val listEntity = db.siswaDao().getAllSiswa()
                // Konversi data dari Database (Entity) ke data class yang dipakai Adapter
                val listSiswa = listEntity.map { Siswa(it.nama, it.kelas, it.nilai) }
                rvSiswa.adapter = SiswaAdapter(listSiswa) {
                    Toast.makeText(context, "Siswa: ${it.nama}", Toast.LENGTH_SHORT).show()
                }
            }
        }

        btnSimpan.setOnClickListener {
            val nama = etNama.text.toString()
            val kelas = etKelas.text.toString()
            val nilai = etNilai.text.toString().toIntOrNull() ?: 0

            if (nama.isNotEmpty() && kelas.isNotEmpty()) {
                lifecycleScope.launch(Dispatchers.IO) {
                    db.siswaDao().insert(SiswaEntity(nama = nama, kelas = kelas, nilai = nilai))
                    withContext(Dispatchers.Main) {
                        Toast.makeText(context, "Data tersimpan permanen!", Toast.LENGTH_SHORT).show()
                        etNama.text.clear()
                        etKelas.text.clear()
                        etNilai.text.clear()
                        loadData()
                    }
                }
            } else {
                Toast.makeText(context, "Isi nama dan kelas dulu ya", Toast.LENGTH_SHORT).show()
            }
        }

        loadData()
    }
}