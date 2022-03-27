package com.mendozavalerio.hoteles.adaptador

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mendozavalerio.hoteles.R
import com.mendozavalerio.hoteles.modelo.Hotel
import com.squareup.picasso.Picasso

class AdaptadorHotel (val listaHoteles: ArrayList<Hotel>):RecyclerView.Adapter<AdaptadorHotel.ViewHolder>(){
    //comentario


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.vistaindividual,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvNombreH.text = listaHoteles[position].nombreHotel
        holder.tvLugar.text = listaHoteles[position].ubicacion
        holder.tvPrecio.text = listaHoteles[position].precio
        Picasso.get().load(listaHoteles[position].foto).into(holder.ivHotel)
    }

    override fun getItemCount(): Int {
        return listaHoteles.size
    }

    class ViewHolder(vista: View):RecyclerView.ViewHolder(vista){
        val tvNombreH:TextView
        val tvLugar:TextView
        val tvPrecio:TextView
        val ivHotel:ImageView

        init {
            tvNombreH = vista.findViewById(R.id.tvNombreH)
            tvLugar = vista.findViewById(R.id.tvLugar)
            tvPrecio = vista.findViewById(R.id.tvPrecio)
            ivHotel = vista.findViewById(R.id.ivHotel)
        }
    }
}