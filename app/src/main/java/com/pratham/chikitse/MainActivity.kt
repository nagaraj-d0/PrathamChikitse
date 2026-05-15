package com.pratham.chikitse

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var rvEmergencies: RecyclerView
    private lateinit var btnCall108: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup views
        rvEmergencies = findViewById(R.id.rvEmergencies)
        btnCall108 = findViewById(R.id.btnCall108)

        // Setup RecyclerView as 2 column grid
        rvEmergencies.layoutManager = GridLayoutManager(this, 2)

        // Setup adapter with click listener
        val adapter = EmergencyAdapter(EmergencyData.getEmergencies()) { emergency ->
            val intent = Intent(this, EmergencyDetailActivity::class.java).apply {
                putExtra("EMERGENCY_ID", emergency.id)
                putExtra("EMERGENCY_NAME_EN", emergency.nameEn)
                putExtra("EMERGENCY_NAME_KN", emergency.nameKn)
            }
            startActivity(intent)
        }
        rvEmergencies.adapter = adapter

        // Call 108 button
        btnCall108.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:108")
            }
            startActivity(intent)
        }
    }
}