package com.nadila.detailbuah

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailBuah : AppCompatActivity() {
    private lateinit var txtdetailbuah : TextView
    private lateinit var imgdetailbuah : ImageView
    private lateinit var txtdetailLokasi : TextView
    private lateinit var txtdetailDeskripsi : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        txtdetailbuah = findViewById(R.id.txtdetailbuah)
        imgdetailbuah = findViewById(R.id.imgdetailbuah)
        txtdetailLokasi = findViewById(R.id.txtdetailLokasi)
        txtdetailDeskripsi = findViewById(R.id.txtdetailDeskripsi)

        //get data dari intent
        val detailTeks = intent.getStringExtra("nama")
        val detailImg = intent.getIntExtra("image",0)
        val detailLokasi = intent.getStringExtra("lokasi")
        val detailDeskripsi = intent.getStringExtra("deskripsi")

        //set data ke widget
        txtdetailbuah.setText(detailTeks)
        imgdetailbuah.setImageResource(detailImg)
        txtdetailLokasi.setText(detailLokasi)
        txtdetailDeskripsi.setText(detailDeskripsi)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}