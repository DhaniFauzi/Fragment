package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)
        val mFragmentManager = fragmentManager
        val secondFragment = SecondFragment()
        val mBundle = Bundle()
        secondFragment.arguments = mBundle

        binding.btnSend.setOnClickListener {
            val nama = et_nama.text.toString()
            val squad = et_squad.text.toString()
            val angkatan = et_angkatan.text.toString()
            val hobi = et_hobi.text.toString()

            mBundle.putString("nama", nama)
            mBundle.putString("squad", squad)
            mBundle.putString("angkatan", angkatan)
            mBundle.putString("hobi", hobi)
            mFragmentManager?.beginTransaction()?.apply {
                replace(R.id.FragmentContainer,
                    secondFragment,
                    SecondFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
        return binding.root
    }

}