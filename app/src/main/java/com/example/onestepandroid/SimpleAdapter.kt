package com.example.onestepandroid

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SimpleAdapter(val list: List<String>) :
    RecyclerView.Adapter<SimpleAdapter.SomeViewHolder>() {

    companion object {
        const val TAG = "SimpleAdapter"
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): SomeViewHolder {
        Log.d(TAG, "onCreateViewHolder")
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_view, viewGroup, false)
        return SomeViewHolder(view)
    }

    override fun getItemCount(): Int = list.count()

    override fun onBindViewHolder(viewHolder: SomeViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder $position")
        viewHolder.bind(list[position])
    }

    class SomeViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(text: String) {
            Log.d(TAG, "text: $text")
            view.findViewById<TextView>(R.id.itemViewTV).text = text
        }
    }

}
