package com.udacity.shoestore.Onboarding

import android.database.DatabaseUtils
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.OnboardingFragmentBinding

class OnboardingFragment : Fragment() {



    private lateinit var binding: OnboardingFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.onboarding_fragment,container,false)
        binding.InstructionButton.setOnClickListener { findNavController().navigate(OnboardingFragmentDirections.actionOnboardingFragmentToInstruction()) }


        return  binding.root

    }


}