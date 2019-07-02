package com.example.onestepandroid.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.onestepandroid.R
import kotlinx.android.synthetic.main.start_activity.*

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)

        val button = this.findViewById<Button>(R.id.ourButton)

        button.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "pressed", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            this.startActivity(intent)
        })

        requestButton.setOnClickListener {
            this.startActivity(Intent(this, ThirdActivity::class.java))
        }
    }


}