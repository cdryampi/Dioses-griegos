package com.example.reciclerview.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reciclerview.R
import com.example.reciclerview.adapters.DiosAdapter
import com.example.reciclerview.databinding.DataitemBinding
import com.example.reciclerview.models.Dios

class ViewHolderItem(inflate: View) :RecyclerView.ViewHolder(inflate) {

    val binding = DataitemBinding.bind(inflate)

    fun render(item: Dios){

        binding.nombre.text = item.nombre
        binding.descripcion.text = item.descripcion
        binding.activo.text = item.activo.toString()
        Glide.with(binding.imageView.context).load(item.imagen).into(binding.imageView)
    }
    //


}
