package com.example.exmp_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

private var View.text: String
    get() {}
    set() {}

class SuperHeroAdapter (
    private val context: Context,
    private val superhero: List<SuperHero>,
    val listener: (SuperHero) -> Unit
) : RecyclerView.Adapter<SuperHeroAdapter.SuperHeroViewHolder>(){

    class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgSuperhro = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhro = view.findViewById<ImageView>(R.id.img_item_photo)
        val descSuperhro = view.findViewById<ImageView>(R.id.img_item_photo)

        fun bindView(superhero: SuperHero, listener: (SuperHero) -> Unit){
            imgSuperhro.setImageResource(superhero.imgSuperhro)
            nameSuperhro.text = superhero.nameSuperhro
            descSuperhro.text = superhero.descSuperhero
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        return SuperHeroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }


    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        holder.bindView(superhero[position], listener)
    }

    override fun getItemCount(): Int = superhero.size
    }

}
