package com.example.navbonus.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navbonus.R
import com.example.navbonus.databinding.FragmentCounterBinding

class CounterFragment : Fragment(R.layout.fragment_counter) {

    private lateinit var binding: FragmentCounterBinding
    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCounterBinding.inflate(inflater, container, false)

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter", 0)
        }

        binding.btnIncrease.setOnClickListener {
            counter++
            binding.tvCounter.text = counter.toString()
        }

        binding.tvCounter.text = counter.toString()

        return binding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("counter", counter)
    }
}
