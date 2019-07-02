package com.example.onestepandroid.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import com.example.onestepandroid.App.Companion.api
import com.example.onestepandroid.R
import com.example.onestepandroid.model.TodosModel
import kotlinx.android.synthetic.main.third_activity.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ThirdActivity: AppCompatActivity() {

    companion object {
        const val TAG = "SecondActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)

        button.setOnClickListener { requestTodos() }
    }

    private var counter = 1

    private fun requestTodos() {
        api
            .requestTodos(counter)
            .enqueue(object : Callback<TodosModel> {
                override fun onResponse(call: Call<TodosModel>, response: Response<TodosModel>) {
                    counter++

                    val userIdTextView = this@ThirdActivity.findViewById<TextView>(R.id.userIdTextView)
                    val idTextView = this@ThirdActivity.findViewById<TextView>(R.id.idTextView)
                    val titleTextView = this@ThirdActivity.findViewById<TextView>(R.id.titleTextView)
                    val completedTextView = this@ThirdActivity.findViewById<TextView>(R.id.completedTextView)

                    userIdTextView.text = response.body()?.userId.toString()
                    idTextView.text = response.body()?.id.toString()
                    titleTextView.text = response.body()?.title.orEmpty()
                    completedTextView.text = response.body()?.completed.toString()

                }

                override fun onFailure(call: Call<TodosModel>, t: Throwable) {
                    Log.e(TAG, "onFailure()", t)
                }
            })
    }
}