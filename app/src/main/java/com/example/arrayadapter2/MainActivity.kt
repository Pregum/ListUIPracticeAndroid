package com.example.arrayadapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SimpleAdapter
import layout.ColorPaletteDetail

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorPaletteData = ColorPaletteDetail.getData()

        val colorPaletteAdapter = ColorPaletteAdapter(
            this,
            R.layout.color_palette,
            colorPaletteData
        )

        val colorPaletteList = findViewById<ListView>(R.id.color_palette_list)
        colorPaletteList.adapter = colorPaletteAdapter
    }
}