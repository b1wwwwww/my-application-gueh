package com.example.my_first_application

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SiswaDao{
    // Menyimpan data siswa baru
    @Insert
    suspend fun insert(siswa: SiswaEntity)

    // Mengambil semua data siswa, urut berdasarkan nama
    @Query("SELECT * FROM siswa ORDER BY nama ASC")
    suspend fun getAllSiswa(): List<SiswaEntity>

    // Menghapus satu data siswa
    @Delete
    suspend fun delete(siswa: SiswaEntity)

    // Mengperbarui data siswa yang sudah ada
    @Update
    suspend fun update(siswa: SiswaEntity)
}