package com.udacity.shoestore.Shoelisting

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.ShoelistingFragmentBinding
import com.udacity.shoestore.login.LoginFragmentDirections

class ShoelistingFragment : Fragment() {


    private lateinit var viewModel: ShoelistingViewModel
    private lateinit var binding: ShoelistingFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.shoelisting_fragment,container,false)

        setHasOptionsMenu(true)

        binding.toshoedetails.setOnClickListener {
            findNavController().navigate(ShoelistingFragmentDirections.actionShoelistingFragmentToShoedetailpageFragment())
        }

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.logout,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.logout -> {
                findNavController().navigate(LoginFragmentDirections.actionGlobalLoginFragment())
            }
        }
        return super.onOptionsItemSelected(item)
    }
}