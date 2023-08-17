package com.packagename.daggermvvm.models


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity
data class Product(
    @SerializedName("category")
    val category: String,
    @SerializedName("description")
    val description: String,
    @PrimaryKey(autoGenerate = false)  //by me
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("title")
    val title: String
)