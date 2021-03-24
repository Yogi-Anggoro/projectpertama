package com.example.tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kalkulatorsederhana.*

class kalkulatorsederhana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulatorsederhana)
        bg_bagi.setOnClickListener {
            val nilai1 = angka1.text.toString()
            val nilai2 = angka2.text.toString()

            val jumlah = nilai1.toInt() / nilai2.toInt()
            hasil.text = jumlah.toString()
        }
        bg_tambah.setOnClickListener {
            val nilai1 = angka1.text.toString()
            val nilai2 = angka2.text.toString()

            val jumlah = nilai1.toInt() + nilai2.toInt()
            hasil.text = jumlah.toString()
        }
        bg_kali.setOnClickListener {
            val nilai1 = angka1.text.toString()
            val nilai2 = angka2.text.toString()

            val jumlah = nilai1.toInt() * nilai2.toInt()
            hasil.text = jumlah.toString()
        }
        bg_kurang.setOnClickListener {
            val nilai1 = angka1.text.toString()
            val nilai2 = angka2.text.toString()

            val jumlah = nilai1.toInt() - nilai2.toInt()
            hasil.text = jumlah.toString()
        }
    }
}