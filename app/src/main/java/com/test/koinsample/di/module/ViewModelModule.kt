package com.test.koinsample.di.module

import com.test.koinsample.ui.MainViewModel
import org.koin.dsl.module
import org.koin.android.viewmodel.dsl.viewModel

val viewModelModule = module {
    viewModel {
        MainViewModel(get(),get())
    }
}