package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.databinding.ActivityMainBinding
import com.example.fragment.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {
        val EXTRA_NAME = "nama"
        val EXTRA_SQUAD = "squad"
        val EXTRA_ANGKATAN = "angkatan"
        val EXTRA_HOBI = "hobi"
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if(arguments != null){
            val nama = arguments?.getString(EXTRA_NAME)
            val squad = arguments?.getString(EXTRA_SQUAD)
            val angkatan = arguments?.getString(EXTRA_ANGKATAN)
            val hobi = arguments?.getString(EXTRA_HOBI)

            binding.tvNama.text = "Nama : $nama"
            binding.tvSquad.text = "Squad : $squad"
            binding.tvAngkatan.text = "Angkatan : $angkatan"
            binding.tvHobi.text = "Hobi : $hobi"
        }
    }
}