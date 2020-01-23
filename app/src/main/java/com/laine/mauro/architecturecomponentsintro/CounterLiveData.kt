package com.laine.mauro.architecturecomponentsintro

import android.util.Log
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
        Log.d(TAG, "onInactive")
    }

    override fun onActive() {
        super.onActive()
        Log.d(TAG, "onActive")
    }

    companion object {
        val TAG = "CounterLiveData"
    }
}