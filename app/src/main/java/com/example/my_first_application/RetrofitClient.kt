package com.example.my_first_application

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    // BASE_URL: Alamat dasar server internetnya.
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val apiService: ApiService by lazy { // by lazy biar hemat memori
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            // mengubah format JSON dari internet menjadi objek Kotlin User secara otomatis
            .build()
            .create(ApiService::class.java)
    }
}