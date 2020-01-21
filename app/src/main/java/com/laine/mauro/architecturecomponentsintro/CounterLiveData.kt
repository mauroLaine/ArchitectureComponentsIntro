package com.laine.mauro.architecturecomponentsintro

import androidx.lifecycle.LiveData

class CounterLiveData : LiveData<Int>() {

    init {
        value = 0
    }

    fun increaseCounter() {
        value = value!!.plus(1)
    }

    override fun onInactive() {
        super.onInactive()
    }

    override fun onActive() {
        super.onActive()
    }
}