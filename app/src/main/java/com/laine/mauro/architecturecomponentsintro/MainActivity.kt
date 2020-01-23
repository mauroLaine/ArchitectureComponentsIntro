package com.laine.mauro.architecturecomponentsintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var counterViewModel: CounterViewModel
    private lateinit var counterLiveData: CounterLiveData
    private lateinit var counterLiveDataModel: CounterLiveDataModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //View Model initialization
        counterViewModel = ViewModelProviders.of(this)[CounterViewModel::class.java]
        updateVMCounter(counterViewModel.counter)
        vm_increase_btn.setOnClickListener {
            counterViewModel.increaseCounter()
            updateVMCounter(counterViewModel.counter)
        }

        //Live Data implementation
        counterLiveData = CounterLiveData()
        subscribeLD()
        ld_increase_btn.setOnClickListener {
            counterLiveData.increaseCounter()
        }

        //View Model using Live Data
        counterLiveDataModel = ViewModelProviders.of(this)[CounterLiveDataModel::class.java]
        subscribeVMLD()
        vm_ld_increase_btn.setOnClickListener {
            counterLiveDataModel.increaseCounter()
        }

        SimpleLifecycleObserver.bindInto(this)
    }

    fun updateVMCounter(value: Int) {
        vm_counter_tv.text = value.toString()
    }


    fun subscribeLD() {
        val observer = Observer<Int> {
            ld_counter_tv.text = it.toString()
        }
        counterLiveData.observe(this, observer)
    }

    fun subscribeVMLD() {
        val observer = Observer<Int> {
            vm_ld_counter_tv.text = it.toString()
        }
        counterLiveDataModel.getCounter().observe(this, observer)
    }
}
