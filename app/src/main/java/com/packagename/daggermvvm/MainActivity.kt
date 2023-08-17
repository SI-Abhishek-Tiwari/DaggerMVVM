package com.packagename.daggermvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.packagename.daggermvvm.viewmodels.MainViewModel

import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

//    @Inject
//    lateinit var mainViewModelFactory: MainViewModelFactory

    private val products: TextView
        get() = findViewById(R.id.products)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        (application as FakerApplication).applicationComponent.inject(this)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.productsLiveData.observe(this, Observer {
          products.text =  it.joinToString { x -> x.description + "\n\n" }
        })
    }
}