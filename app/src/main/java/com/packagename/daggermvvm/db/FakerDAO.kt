package com.packagename.daggermvvm.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.packagename.daggermvvm.models.Product

@Dao  // to acess data from product model entity
interface FakerDAO {

    @Insert (onConflict = OnConflictStrategy.REPLACE)  //it help to store data in database
    suspend fun addProducts(products : List<Product>) //here list of product is add to database thats y we use insert and the quesry is generate by room

    @Query("SELECT * FROM Product") // it help to us to acess data
    suspend fun getProducts() : List<Product>

}