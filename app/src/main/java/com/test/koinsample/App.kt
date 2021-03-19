package com.test.koinsample

import android.app.Application
import com.test.koinsample.di.module.appModule
import com.test.koinsample.di.module.repoModule
import com.test.koinsample.di.module.sharePreModule
import com.test.koinsample.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule, sharePreModule))
        }
    }
}