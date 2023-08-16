package com.example.arrayadapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import layout.ColorPaletteDetail
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private val dataset: List<String> = (0 ..20).map {
        String.format(Locale.ENGLISH, "Data_0%d", it)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view)

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

        // use a linear layout manager
        val rLayoutManager: LayoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = rLayoutManager

        val adapter = MyAdapter(dataset)
        recyclerView.adapter = adapter
    }
}