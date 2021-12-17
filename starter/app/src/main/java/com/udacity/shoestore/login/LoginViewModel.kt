package com.udacity.shoestore.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _logon = MutableLiveData<Boolean>()
    val login : LiveData<Boolean>
        get() = _logon

    fun  OnLogin(){
        _logon.value = true
    }
    fun  OnLoginComplete(){
        _logon.value = false
    }
    // TODO: Implement the ViewModel
}