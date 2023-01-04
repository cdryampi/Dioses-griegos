package com.example.reciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.reciclerview.adapters.DiosAdapter
import com.example.reciclerview.databinding.ActivityMainBinding
import com.example.reciclerview.models.Dios
import com.example.reciclerview.providers.DiosProvider

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }
    // Inicializar el RecyclerView
    fun initRecyclerView(){

        val recyclerView = binding.reciclerMain
        recyclerView.adapter = DiosAdapter(this)
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
    }


}