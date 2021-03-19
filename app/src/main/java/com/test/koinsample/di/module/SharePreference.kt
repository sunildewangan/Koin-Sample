package com.test.koinsample.di.module

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import org.koin.dsl.module

val sharePreModule = module {
    single { provideSharePref(get()) }
    single { getEditor(get()) }
}

fun provideSharePref(context: Context):SharedPreferences = context.getSharedPreferences("my",MODE_PRIVATE)

fun getEditor(sharedPreferences: SharedPreferences):SharedPreferences.Editor = sharedPreferences.edit()