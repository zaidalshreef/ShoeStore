package com.udacity.shoestore.Shoelisting

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.udacity.shoestore.R

class ShoelistingFragment : Fragment() {

    companion object {
        fun newInstance() = ShoelistingFragment()
    }

    private lateinit var viewModel: ShoelistingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.shoelisting_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ShoelistingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}