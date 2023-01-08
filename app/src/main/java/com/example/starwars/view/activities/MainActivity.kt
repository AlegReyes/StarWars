package com.example.starwars.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.starwars.R
import com.example.starwars.databinding.ActivityMainBinding
import com.example.starwars.model.Mapear
import com.example.starwars.model.Results
import com.example.starwars.model.StarApi
import com.example.starwars.util.Constants
import com.example.starwars.view.adapters.Adapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: com.example.starwars.databinding.ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.SplashTheme)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.IO).launch {
            val call = Constants.getRetrofit().create(StarApi::class.java).Mapear("api/people/?format=json")// people/?format=json  asi no daba fue mi sufrimiento aaaaaaaaa

            call.enqueue(object: Callback<Mapear>{//Callback<ArrayList<Mapear>>
                override fun onResponse(
                    call: Call<Mapear>,//Call<ArrayList<Mapear>>
                    response: Response<Mapear>//<ArrayList<Mapear>>
                ) {
                    Log.d(Constants.LOGTAG, "${getString(R.string.respuesta)} ${response.toString()}")
                    Log.d(Constants.LOGTAG, "${getString(R.string.datos)} ${response.body().toString()}")
                    binding.rvMenu.layoutManager = LinearLayoutManager(this@MainActivity)
                    binding.rvMenu.adapter = Adapter(this@MainActivity,response.body()!!.resultados)
                    binding.pbConexion.visibility= View.GONE

                    //Este codigo para iterar de debug
                    /*
                    val datosTmp: Mapear
                    for(datosTmp in response.body()!!){
                        Toast.makeText(this@MainActivity, "Nombre del juego: ${datosTmp.nombre}",Toast.LENGTH_SHORT).show()
                    }*/
                }

                override fun onFailure(call: Call<Mapear>, t: Throwable) {
                    binding.pbConexion.visibility = View.GONE
                    Toast.makeText(this@MainActivity, " ${getString(R.string.econexion)} ${t.message}", Toast.LENGTH_SHORT).show()

                }

            })

        }


    }

    fun selectedDatos(results: Results) {
        //aqui programamos el click de cada elemetno del recycler view
        val parametros = Bundle()
        parametros.apply {
            putString("nombre", results.nombre)
        }

        val intent = Intent(this@MainActivity, Details::class.java)
        intent.putExtras(parametros)
        startActivity(intent)

    }

}