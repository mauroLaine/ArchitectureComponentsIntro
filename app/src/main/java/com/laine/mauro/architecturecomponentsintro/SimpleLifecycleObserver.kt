package com.laine.mauro.architecturecomponentsintro

import android.util.Log
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.LifecycleOwner


class SimpleLifecycleObserver(provider: LifecycleOwner) : LifecycleObserver {

    init {
        provider.lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun callMeOnCreate() {
        Log.d(TAG, "onCreate() has been called!")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun callMeOnStart() {
        Log.d(TAG, "onStart() has been called!")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun callMeOnResume() {
        Log.d(TAG, "onResume() has been called!")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun callMeOnPause() {
        Log.d(TAG, "onPause() has been called!")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun calleMeOnStop() {
        Log.d(TAG, "onStop() has been called!")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun calleMeOnDestroy() {
        Log.d(TAG, "onDestroy() has been called!")
    }

    companion object {
        val TAG = SimpleLifecycleObserver::class.toString()

        fun bindInto(provider: LifecycleOwner): SimpleLifecycleObserver {
            return SimpleLifecycleObserver(provider)
        }
    }
}