package cl.sebastian.pokemones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import cl.sebastian.pokemones.databinding.ActivityMainBinding

/*
Lista de actividades
[] mostrar lista de pokemones
[]Usar spinner con tipos de pokemones
adapter para spinner

 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvlistapokemones.adapter=PokeAdapter()
        binding.rvlistapokemones.layoutManager=LinearLayoutManager(this)
    }
}