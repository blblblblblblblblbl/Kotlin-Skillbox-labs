package com.blblblbl.tz

import android.app.Application

class MyApplication:Application() {
    lateinit var  viewModel: ViewModel
    override fun onCreate() {
        super.onCreate()
        val cache =  CacheDataSource(this)
        //cache.with(this)
        viewModel = ViewModel(Model(cache))
    }
}