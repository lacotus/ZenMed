package com.example.zenmed

import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.zenmed.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val soundButton: Button = findViewById(R.id.sound_button)
        val timeButton: Button = findViewById(R.id.time_button)

        replaceFragment(Screen1Fragment())

        soundButton.setOnClickListener {
            replaceFragment(Screen1Fragment())
        }

        timeButton.setOnClickListener {
            replaceFragment(Screen2Fragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.contentArea, fragment)
            .commit()
    }
}