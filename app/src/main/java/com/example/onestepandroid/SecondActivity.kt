package com.example.onestepandroid

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

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