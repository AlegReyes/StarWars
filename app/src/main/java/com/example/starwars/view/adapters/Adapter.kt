package com.example.starwars.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.starwars.databinding.StElementBinding
import com.example.starwars.model.Mapear
import com.example.starwars.model.Results
import com.example.starwars.view.activities.MainActivity

class Adapter(private val contexto: Context, private val datos: ArrayList<Results>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(view: StElementBinding): RecyclerView.ViewHolder(view.root) {
        val nombre=view.tvNombre
        val altura=view.tvAltura
        val fecha=view.tvFecha
        val genero=view.tvGenero

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = StElementBinding.inflate(LayoutInflater.from(contexto))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombre.text=datos[position].nombre
        holder.altura.text=datos[position].altura
        holder.fecha.text=datos[position].fecha
        holder.genero.text=datos[position].genero

        //para cargar la imagen
        /*Glide.with(contexto)
            .load(datos[position].thumbnail)
            .into(holder.ivThumbnail)

        holder.ivThumbnail.setOnClickListener{//un clicklistener en la imagen


        holder.itemView.setOnClickListener{
            if(contexto is MainActivity) contexto.selectedDatos(datos[position])

        }
         */
    }

    override fun getItemCount(): Int = datos.size
//aqui se va a llenar el recycler view
}