package com.example.managerpracticeapp.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.managerpracticeapp.databinding.ActivityMainBinding
import com.example.managerpracticeapp.ui.login.LoginEntryActivity
import com.example.managerpracticeapp.ui.reservation.ReservationStep1Activity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigateToLogin()

    }

    private fun navigateToLogin() {
        binding.goReservationBtn.setOnClickListener {
            val intent = Intent(this, ReservationStep1Activity::class.java)
            startActivity(intent)
        }
    }
}