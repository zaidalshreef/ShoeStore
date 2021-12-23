package com.udacity.shoestore.shoedetailpage

import android.util.Log
import android.util.Log.INFO
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe
import java.util.logging.Level.INFO
import kotlin.math.log

class ShoedetailpageViewModel : ViewModel() {

    val name = MutableLiveData<String>()
    val company = MutableLiveData<String>()
    val size = MutableLiveData<String>()
    val desc = MutableLiveData<String>()


    private val _complete = MutableLiveData<Boolean>(false)
    val complete : LiveData<Boolean>
        get() = _complete

    private val _shoelist = MutableLiveData<List<Shoe>>(emptyList())
    val shoelist : LiveData<List<Shoe>>
        get() = _shoelist



    fun OnCancel(){
        _complete.value = true
    }


    fun OnSaved(){

        val size = size.value ?: ""
        val company = company.value ?: ""
        val name = name.value ?: ""
        val desc = desc.value ?: ""

        val shoe = Shoe(size = size.toDoubleOrNull() ?: 0.0 , company = company, name = name, description = desc)

        _shoelist.value = (_shoelist.value)?.plus(shoe)

        _complete.value = true
    }

    fun Oncomplete(){
        _complete.value = false
    }


}