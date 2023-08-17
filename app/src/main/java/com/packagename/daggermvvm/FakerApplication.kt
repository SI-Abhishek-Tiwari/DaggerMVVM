package com.packagename.daggermvvm

import android.app.Application


import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FakerApplication : Application() {

//    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

//        applicationComponent = DaggerApplicationComponent.builder().build() //Dagger

//        applicationComponent = DaggerApplicationComponent.factory().create(this)

    }
}