package com.laine.mauro.architecturecomponentsintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var counterViewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterViewModel = ViewModelProviders.of(this)[CounterViewModel::class.java]
        updateUI(counterViewModel.counter)

        vm_increase_btn.setOnClickListener {
            counterViewModel.increaseCounter()
            updateUI(counterViewModel.counter)
        }
    }

    fun updateUI(value: Int) {
        vm_counter_tv.text = value.toString()
    }
}
