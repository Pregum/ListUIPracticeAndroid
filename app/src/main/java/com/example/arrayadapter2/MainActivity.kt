package com.example.arrayadapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SimpleAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val androidVersions = AndroidVersionDetail.getData()

        val androidVersionListAdapter = SimpleAdapter(
            applicationContext,
            androidVersions,
            R.layout.android_version,
            arrayOf<String>("platformVersion", "apiLevel", "versionCode"),
            intArrayOf(R.id.platform_version, R.id.api_level, R.id.version_code)
        )

        val listView: ListView = findViewById(R.id.android_version_list)
        listView.adapter = androidVersionListAdapter
    }
}