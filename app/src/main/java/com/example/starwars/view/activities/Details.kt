package com.example.starwars.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.starwars.R
import com.example.starwars.databinding.ActivityDetailsBinding
import com.example.starwars.model.PlanetasDetail
import com.example.starwars.model.StarApi
import com.example.starwars.util.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Details : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bundle = intent.extras
        val id = bundle?.getString("homeworld", "")

        //val call = Constants.getRetrofit().create(StarApi::class.java).getMapearDetail(id)
        val call = Constants.getRetrofit().create(StarApi::class.java).Mapear("api/people/?format=json")
/*
        CoroutineScope(Dispatchers.IO).launch {
        call.enqueue(object: Callback<PlanetasDetail> {
            override fun onResponse(
                call: Call<PlanetasDetail>,
                response: Response<PlanetasDetail>
            ) {
                binding.pbConexion.visibility = View.GONE
                with(binding){

                }

            }

            override fun onFailure(call: Call<PlanetasDetail>, t: Throwable) {
                binding.pbConexion.visibility = View.GONE
                Toast.makeText(this@Details, "Error de Conexion: ${t.message}", Toast.LENGTH_SHORT).show()
            }

        })
        }
 */
    }
}