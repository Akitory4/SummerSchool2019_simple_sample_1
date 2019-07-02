package com.example.onestepandroid.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.onestepandroid.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        initRecycler()
    }

    private fun initRecycler() {
        val list = listOf<String>("one", "two", "three", "four")

        val recycler: RecyclerView = findViewById<RecyclerView>(R.id.recyclerList)
        recycler.adapter = SimpleAdapter(list)
        recycler.layoutManager = LinearLayoutManager(this)
    }

}