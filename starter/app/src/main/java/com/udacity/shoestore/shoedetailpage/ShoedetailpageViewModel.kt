package com.udacity.shoestore.shoedetailpage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

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


    val valid = MediatorLiveData<Boolean>().apply {
        addSource(name){
            value = validate()
        }
        addSource(company){
            value = validate()
    }
        addSource(size){
            value = validate()
        }
        addSource(desc){
            value = validate()
        }
    }




    private fun validate(): Boolean {
        val name = !name.value?.trim().isNullOrEmpty()
        val company = !company.value?.trim().isNullOrEmpty()
        val size = !size.value?.trim().isNullOrEmpty()
        val description = !desc.value?.trim().isNullOrEmpty()
        return name && company && size && description
    }



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

         size.value = ""
         company.value = ""
         name.value = ""
         desc.value = ""

        _complete.value = false
    }


}