package com.laine.mauro.architecturecomponentsintro

import androidx.lifecycle.LiveData

class CounterLiveData() : LiveData<Int>() {

    fun CounterLiveData() {
        value = 0
    }

    fun increaseCounter() {
        value = +1
    }

    override fun onInactive() {
        super.onInactive()
    }

    override fun onActive() {
        super.onActive()
    }
}