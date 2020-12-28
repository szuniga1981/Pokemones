package cl.sebastian.pokemones

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.sebastian.pokemones.databinding.ItemListPokemonBinding


class PokeAdapter : RecyclerView.Adapter<PokeAdapter.PokemonVH>() {
//val pokedex=Pokedex()
//val listaPokemones= pokedex.pokelist  esto es lo mismo que la linea 13
    val listaPokemones=Pokedex().pokelist
    class PokemonVH(val biding:ItemListPokemonBinding) : RecyclerView.ViewHolder(biding.root) {
        fun bind(pokemon: Pokemon) {
            biding.pokeNombres.text=pokemon.name

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonVH {
       val  biding = ItemListPokemonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonVH(biding)
    }

    override fun onBindViewHolder(holder: PokemonVH, position: Int) {
     val pokemon=listaPokemones.get(position)
        holder.bind(pokemon)
    }

    override fun getItemCount(): Int {
      return listaPokemones.size
    }
}