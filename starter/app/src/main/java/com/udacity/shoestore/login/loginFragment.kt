package com.udacity.shoestore.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.LoginFragmentBinding
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : Fragment() {


    private lateinit var binding : LoginFragmentBinding
    private lateinit var ViewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.login_fragment,container,false)
        ViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding.logininfo = ViewModel

       ViewModel.login.observe(viewLifecycleOwner, Observer { haslooged ->
            if (haslooged){
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToOnboardingFragment())
                ViewModel.OnLoginComplete()
            }
        })





        return  binding.root

    }


}