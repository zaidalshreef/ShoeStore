package com.udacity.shoestore.shoedetailpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.ShoedetailpageFragmentBinding


class ShoedetailpageFragment : Fragment() {



    private lateinit var binding: ShoedetailpageFragmentBinding
    private val viewModel: ShoedetailpageViewModel by activityViewModels()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.shoedetailpage_fragment,container,false)
        binding.shoe = viewModel


        viewModel.complete.observe(viewLifecycleOwner, Observer { hascompleted ->
            if (hascompleted) {
                findNavController().navigate(ShoedetailpageFragmentDirections.actionShoedetailpageFragmentToShoelistingFragment())
                viewModel.Oncomplete()
            }
        })



        return binding.root
    }



}