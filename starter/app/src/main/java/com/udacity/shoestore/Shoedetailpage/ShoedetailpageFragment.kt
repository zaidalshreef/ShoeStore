package com.udacity.shoestore.Shoedetailpage

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.udacity.shoestore.R

class ShoedetailpageFragment : Fragment() {

    companion object {
        fun newInstance() = ShoedetailpageFragment()
    }

    private lateinit var viewModel: ShoedetailpageViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.shoedetailpage_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ShoedetailpageViewModel::class.java)
        // TODO: Use the ViewModel
    }

}