package com.example.my_first_application

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [SiswaEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun siswaDao(): SiswaDao
}