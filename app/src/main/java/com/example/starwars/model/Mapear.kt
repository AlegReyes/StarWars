package com.example.starwars.model

import com.google.gson.annotations.SerializedName

data class Mapear (
    @SerializedName("name")//aqui debe estar exactamente como esta el atributo en el json
    var nombre: String? = null,
    @SerializedName("height")
    var altura: String? = null,
    @SerializedName("birth_year")
    var fecha: String? = null,
    @SerializedName("gender")
    var genero: String? = null,
    @SerializedName("results")
    var resultados: ArrayList<Results> = arrayListOf(),
    @SerializedName("count")
    var count: String? = null,
    //var results: Results?= null//aqui el error
        )

class Results {
    @SerializedName("name")//aqui debe estar exactamente como esta el atributo en el json
    var nombre: String? = null
    @SerializedName("height")
    var altura: String? = null
    @SerializedName("birth_year")
    var fecha: String? = null
    @SerializedName("gender")
    var genero: String? = null
}

/*
data class Results5 (

    @SerializedName("name"       ) var name      : String?           = null,
    @SerializedName("height"     ) var height    : String?           = null,
    @SerializedName("mass"       ) var mass      : String?           = null,
    @SerializedName("hair_color" ) var hairColor : String?           = null,
    @SerializedName("skin_color" ) var skinColor : String?           = null,
    @SerializedName("eye_color"  ) var eyeColor  : String?           = null,
    @SerializedName("birth_year" ) var birthYear : String?           = null,
    @SerializedName("gender"     ) var gender    : String?           = null,
    @SerializedName("homeworld"  ) var homeworld : String?           = null,
    @SerializedName("films"      ) var films     : ArrayList<String> = arrayListOf(),
    @SerializedName("species"    ) var species   : ArrayList<String> = arrayListOf(),
    @SerializedName("vehicles"   ) var vehicles  : ArrayList<String> = arrayListOf(),
    @SerializedName("starships"  ) var starships : ArrayList<String> = arrayListOf(),
    @SerializedName("created"    ) var created   : String?           = null,
    @SerializedName("edited"     ) var edited    : String?           = null,
    @SerializedName("url"        ) var url       : String?           = null
)
 */
