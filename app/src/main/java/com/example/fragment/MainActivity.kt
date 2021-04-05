package com.example.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setFragment(FirstFragment())

        binding.btnFragment1.setOnClickListener {
            setFragment(FirstFragment())
        }

        binding.btnFragment2.setOnClickListener {
            setFragment(SecondFragment())
        }

        binding.btnActivityProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

    private fun setFragment (fragment : Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.FragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}