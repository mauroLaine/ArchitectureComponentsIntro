package com.laine.mauro.architecturecomponentsintro

import androidx.lifecycle.ViewModel

data class CounterViewModel(var counter: Int = 0) : ViewModel() {

    fun increaseCounter() {
        counter++
    }

}