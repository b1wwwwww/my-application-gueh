package com.example.my_first_application

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.my_first_application.databinding.ItemSiswaBinding

class SiswaAdapter (
    private val daftarSiswa: List<Siswa>,
    private val onItemClick: (Siswa) -> Unit
) : RecyclerView.Adapter<SiswaAdapter.SiswaViewHolder>() {

    // ViewHolder: Tempat menyimpan referensi tampilan untuk saru baris
    inner class SiswaViewHolder(val binding: ItemSiswaBinding) :
            RecyclerView.ViewHolder(binding.root)

    // Membuat tampilan baru saat dibutuhkan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SiswaViewHolder {
            val binding = ItemSiswaBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        return SiswaViewHolder(binding)
    }

    // Mengisi data ke dalam tampilan (per baris)
    override fun onBindViewHolder(holder: SiswaViewHolder, position: Int) {
        val siswa = daftarSiswa[position]
        holder.binding.tvNamaSiswa.text = siswa.nama
        holder.binding.tvKelasNilai.text = "${siswa.kelas} • Nilai: ${siswa.nilai}"

        // Menangani Klik pada item
        holder.binding.root.setOnClickListener {
            onItemClick(siswa)
        }
    }

    // Jumlah total item dalam daftar
    override fun getItemCount(): Int = daftarSiswa.size

}