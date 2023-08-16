package com.example.arrayadapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val platformVersions: List<String> = listOf(
            "Androd 10.0",
            "Android 9",
            "Android 8.1",
            "Android 8.0",
            "Android 7.1.1",
            "Android 7.1",
            "Android 7.0",
            "Android 6.0",
            "Android 5.1",
            "Android 5.0",
            "Android 4.4W",
            "Android 4.4",
            "Android 4.3",
            "Android 4.2、4.2.2",
            "Android 4.1、4.1.1",
            "Android 4.0.3、4.0.4",
            "Android 4.0、4.0.1、4.0.2",
            "Android 3.2",
            "Android 3.1.x",
            "Android 3.0.x",
            "Android 2.3.4",
            "Android 2.3.3",
            "Android 2.3.2",
            "Android 2.3.1",
            "Android 2.3",
            "Android 2.2.x",
            "Android 2.1.x",
            "Android 2.0.1",
            "Android 2.0",
            "Android 1.6",
            "Android 1.5",
            "Android 1.1",
            "Android 1.0",
        )

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter<String>(
            applicationContext,
            android.R.layout.simple_list_item_1,
            platformVersions
        )
    }
}