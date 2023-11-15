package com.example.ismailov_argen_1_4.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ismailov_argen_1_4.databinding.ActivityMainBinding

class Homeadapter(private var home: String): RecyclerView.Adapter<Homeadapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ActivityMainBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = home.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(home[position])
    }
    inner class ViewHolder(private val binding: ActivityMainBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(music: HomeFragment) {

        }
    }
}