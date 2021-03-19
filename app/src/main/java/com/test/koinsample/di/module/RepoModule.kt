package com.test.koinsample.di.module

import com.test.koinsample.data.api.ApiHelper
import com.test.koinsample.data.api.ApiHelperImpl
import com.test.koinsample.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single { MainRepository(get()) }
    single<ApiHelper> {
        return@single ApiHelperImpl(get())
    }
}