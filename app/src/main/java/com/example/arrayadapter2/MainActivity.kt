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

//    private val dataset: List<String> = (0 ..20).map {
//        String.format(Locale.ENGLISH, "Data_0%d", it)
//    }

    companion object {
        val names = listOf<String>(
            "syuhizei_8percent",
            "money_kokusai",
            "medical_machine_enshin_bunriki",
            "takedajou",
            "computer_kurayami_man",
            "panda_iruka_irowake_iruka",
            "hakken_ufo",
            "mdical_kusuri_medicine",
            "mark_kokusan",
            "buildng_iwate_ginkou"
        )

        val photos = listOf<Int>(
            R.drawable.syouhizei_8percent,
            R.drawable.money_kokusai,
            R.drawable.medical_machine_enshin_bunriki,
            R.drawable.takedajou,
            R.drawable.computer_kurayami_man,
            R.drawable.panda_iruka_irowake_iruka,
            R.drawable.hakken_ufo,
            R.drawable.medical_kusuri_medicine,
            R.drawable.mark_kokusan,
            R.drawable.buildng_iwate_ginkou
        )


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view)

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

        // use a linear layout manager
        val rLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = rLayoutManager
        val emails = mutableListOf<String>()

        for (s in names) {
            val str = String.format(Locale.ENGLISH, "%s@gmail.com", s)
            emails.add(str)
        }

        val adapter = MyAdapter(photos, names, emails)
        recyclerView.adapter = adapter
    }
}