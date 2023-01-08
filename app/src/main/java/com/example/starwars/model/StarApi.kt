package com.example.starwars.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface StarApi {
    //Aqui pongo mis endpoints
    @GET()
    fun Mapear(
        @Url url: String?
    ): Call<Mapear>

    /*
    @GET("people/{id}/?format=json")
    fun getStar(
        @Path("id") id: String?
    ): Call<Mapear>//Call<ArrayList<Mapear>> //Mapear de Mapear.kt
*/
    @GET("api/planets/?format=json")
    fun getMapearDetail(
        @Query("homeworld") mundo:String?,
        @Query("films") peliculas:String
    ): Call<Mapear>


}