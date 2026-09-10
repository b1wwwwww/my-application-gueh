package com.example.my_first_application

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    // mengambil data dari alamat: https://jsonplaceholder.typicode.com/users
    // jadi kita gunakan @GET("users")
    @GET("users")
    fun getUsers(): Call<List<User>>
}
