package com.example.mysports

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mysports.databinding.FragmentMySportsBinding

class MySportsFragment : Fragment(R.layout.fragment_my_sports) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentMySportsBinding.bind(view)

        binding.cardBasketball.setOnClickListener {
            findNavController().navigate(R.id.action_mySports_to_basketball)
        }
        binding.cardSoccer.setOnClickListener {
            findNavController().navigate(R.id.action_mySports_to_soccer)
        }
        binding.cardTennis.setOnClickListener {
            findNavController().navigate(R.id.action_mySports_to_tennis)
        }
    }
}