package com.example.my_first_application
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "siswa")
data class SiswaEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nama: String,
    val kelas: String,
    val nilai: Int
)
