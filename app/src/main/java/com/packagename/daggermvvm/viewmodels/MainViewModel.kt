package com.packagename.daggermvvm.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.packagename.daggermvvm.models.Product
import com.packagename.daggermvvm.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(private val repository: ProductRepository) : ViewModel() {

    val productsLiveData : LiveData<List<Product>>
        get() = repository.product

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }
}