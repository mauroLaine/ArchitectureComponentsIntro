package com.laine.mauro.architecturecomponentsintro

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class CounterLiveDataModel : ViewModel() {

    private val counterLiveData = CounterLiveData()

    fun getCounter(): LiveData<Int> {
        return counterLiveData
    }

    fun increaseCounter() {
        counterLiveData.increaseCounter()
    }
}