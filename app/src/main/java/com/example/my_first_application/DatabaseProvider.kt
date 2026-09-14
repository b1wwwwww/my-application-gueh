package com.example.my_first_application

import android.content.Context
import androidx.room.Room

object DatabaseProvider{
    private var instance: AppDatabase? = null

    fun getDatabase(context: Context): AppDatabase{
        return instance ?: synchronized(this) {
            val db = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "app_database"
            ).build()
            instance = db
            db
        }
    }
}
