package com.example.starwars.model

import com.google.gson.annotations.SerializedName

data class MapearDetail(//aqui vamos a poner los datos de cuando seleccionamos a un personaje del menu
    @SerializedName("homeworld")
    var mundo: String? = null,
    @SerializedName("films")
    var peliculas: ArrayList<String>? = null
)