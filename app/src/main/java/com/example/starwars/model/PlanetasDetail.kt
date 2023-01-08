package com.example.starwars.model

import com.google.gson.annotations.SerializedName

data class PlanetasDetail (
    @SerializedName("count"    ) var count    : Int?               = null,
    @SerializedName("next"     ) var next     : String?            = null,
    @SerializedName("previous" ) var previous : String?            = null,
    @SerializedName("name"            ) var name           : String?           = null,
    @SerializedName("rotation_period" ) var rotationPeriod : String?           = null,
    @SerializedName("orbital_period"  ) var orbitalPeriod  : String?           = null,
    @SerializedName("diameter"        ) var diameter       : String?           = null,
    @SerializedName("climate"         ) var climate        : String?           = null,
    @SerializedName("terrain"         ) var terrain        : String?           = null,
    @SerializedName("population"      ) var population     : String?           = null
    //@SerializedName("results"  ) var results  : ArrayList<Results2> = arrayListOf()
        )
/*
class Results2 {

    @SerializedName("name"            ) var name           : String?           = null,
    @SerializedName("rotation_period" ) var rotationPeriod : String?           = null,
    @SerializedName("orbital_period"  ) var orbitalPeriod  : String?           = null,
    @SerializedName("diameter"        ) var diameter       : String?           = null,
    @SerializedName("climate"         ) var climate        : String?           = null,
    @SerializedName("gravity"         ) var gravity        : String?           = null,
    @SerializedName("terrain"         ) var terrain        : String?           = null,
    @SerializedName("surface_water"   ) var surfaceWater   : String?           = null,
    @SerializedName("population"      ) var population     : String?           = null,
    @SerializedName("residents"       ) var residents      : ArrayList<String> = arrayListOf(),
    @SerializedName("films"           ) var films          : ArrayList<String> = arrayListOf(),
    @SerializedName("created"         ) var created        : String?           = null,
    @SerializedName("edited"          ) var edited         : String?           = null,
    @SerializedName("url"             ) var url            : String?           = null

}
*/