package com.example.ismailov_argen_1_4.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.ismailov_argen_1_4.databinding.ActivityMainBinding
import com.example.ismailov_argen_1_4.databinding.FragmentHomeBinding

class HomeFragment() : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val Task = arrayListOf(
        Homeadapter("Argen"),
        Homeadapter("Argen"),
        Homeadapter("Argen")
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    class Homeadapter(private var home: List<HomeFragment>): RecyclerView.Adapter<Homeadapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Homeadapter.ViewHolder {
            return ViewHolder(ActivityMainBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }

        override fun getItemCount(): Int = home.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(home[position])
        }
        inner class ViewHolder(private val binding: ActivityMainBinding): RecyclerView.ViewHolder(binding.root){
            fun bind(music: HomeFragment) {

            }
        }
    }
}