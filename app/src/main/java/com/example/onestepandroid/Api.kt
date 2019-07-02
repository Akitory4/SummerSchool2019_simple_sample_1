package com.example.onestepandroid

import com.example.onestepandroid.model.TodosModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface Api {

    @GET("/todos/{id}")
    fun requestTodos(@Path("id") id: Int): Call<TodosModel>


}