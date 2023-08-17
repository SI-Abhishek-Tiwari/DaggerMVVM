package com.packagename.daggermvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.packagename.daggermvvm.db.FakerDB
import com.packagename.daggermvvm.models.Product
import com.packagename.daggermvvm.retrofit.FakerApi
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerApi: FakerApi, private val fakerDB: FakerDB) {

    private val _product = MutableLiveData<List<Product>>()
    val product : LiveData<List<Product>>
        get() = _product

    suspend fun getProducts(){
        val result = fakerApi.getProduct()
        if(result.isSuccessful && result.body()!= null){
            fakerDB.getFakerDAO().addProducts(result.body()!!) // database
            _product.postValue(result.body())
        }
    }

}