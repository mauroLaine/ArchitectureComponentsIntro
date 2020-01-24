package com.laine.mauro.architecturecomponentsintro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class CalculationViewModel : ViewModel() {

    private val inputName = MutableLiveData<String>()
    private val nameCounting = Transformations.map(inputName, String::length)

    fun setName(name: String) {
        inputName.value = name
    }

    fun getCounting(): LiveData<Int> {
        return nameCounting
    }

}