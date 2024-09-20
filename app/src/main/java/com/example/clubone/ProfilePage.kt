package com.example.clubone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var registeredClubs: Button = findViewById(R.id.registered_clubs)
        var registeredEvents: Button = findViewById(R.id.registered_events)
        var managementButton: Button = findViewById(R.id.management_button)

        registeredClubs.setOnClickListener {
            val intent = Intent(this, RegClubsPage::class.java)
            startActivity(intent)
        }

        registeredEvents.setOnClickListener {
            val intent = Intent(this, RegEventsPage::class.java)
            startActivity(intent)
        }

        managementButton.setOnClickListener {
            val intent = Intent(this, ManagementPage:class.java)
            startActivity(intent)
        }
    }
}