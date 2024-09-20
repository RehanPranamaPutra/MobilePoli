package com.rehan.politeknik

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rehan.politeknik.adapter.AdapterGeleri
import com.rehan.politeknik.model.Mocklist
import com.rehan.politeknik.model.modelPoli

class RecycleGeleri : AppCompatActivity() {

    private lateinit var rv_galery : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_geleri)

        rv_galery = findViewById(R.id.rv_geleri)

        rv_galery.layoutManager = GridLayoutManager(this,2)
        val adapter = AdapterGeleri(Mocklist.getModel() as ArrayList<modelPoli>, this)
        rv_galery.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}