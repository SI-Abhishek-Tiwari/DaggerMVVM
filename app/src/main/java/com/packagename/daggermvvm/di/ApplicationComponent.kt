package com.packagename.daggermvvm.di

import android.content.Context
import com.packagename.daggermvvm.MainActivity
import com.packagename.daggermvvm.db.DatabaseModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

//@Singleton
//@Component(modules = [NetworkModule::class,DatabaseModule::class])
//interface ApplicationComponent {
//
//    fun inject(mainActivity: MainActivity)  //dagger will see in mainactivity where filed injection is used
//
//    @Component.Factory                   //we use factory to create an object
//    interface Factory{
//        fun create(@BindsInstance context: Context): ApplicationComponent  //we use bind bcz its bind context with applicationcomponent
//    }
//}