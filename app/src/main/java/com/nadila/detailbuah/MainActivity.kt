package com.nadila.detailbuah


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nadila.detailbuah.adapter.BuahAdapter
import com.nadila.detailbuah.model.MockList
import com.nadila.detailbuah.model.ModelBuah

class MainActivity : AppCompatActivity() {
    private lateinit var rv_buah : RecyclerView
//    private lateinit var rv_buah1 : RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        rv_buah = findViewById(R.id.rv_buah)
//        rv_buah1 = findViewById(R.id.rv_buah1)


        //rv_buah1.layoutManager = GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false)

        //rv_buah.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,true)

        rv_buah.layoutManager = GridLayoutManager(this, 1)
        val adapter = BuahAdapter(MockList.getModel(this) as ArrayList<ModelBuah> , this)
        rv_buah.adapter = adapter
//        rv_buah1.adapter =adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}