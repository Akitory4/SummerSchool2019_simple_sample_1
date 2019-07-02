package com.example.onestepandroid

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class App : Application() {

    companion object {
        lateinit var app: Application

        private val retrofit: Retrofit =
                Retrofit.Builder()
                        .baseUrl("https://jsonplaceholder.typicode.com")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()

        val api: Api = retrofit.create(Api::class.java)
    }

    override fun onCreate() {
        super.onCreate()
        app = this
    }





}