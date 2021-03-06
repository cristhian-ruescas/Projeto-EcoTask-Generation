package com.example.ecotask_

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ecotask_.databinding.FragmentCompostBinding

const val LINK_COMPOST = "https://www.ecycle.com.br/compostagem/"

class FragmentCompost : Fragment() {

    lateinit var binding: FragmentCompostBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCompostBinding.inflate(inflater, container, false)


        binding.materialToolbarCompost.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentCompost_to_fragmentDicas)
        }

        binding.linkParaSiteCompost.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(LINK_COMPOST)))
        }
        
        return binding.root
    }
}