package com.udacity.shoestore.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _login = MutableLiveData<Boolean>()
    val login : LiveData<Boolean>
        get() = _login

    init {
        _login.value = false
    }
    fun  OnLogin(){
        _login.value = true
    }
    fun  OnLoginComplete(){
        _login.value = false
    }
    // TODO: Implement the ViewModel
}