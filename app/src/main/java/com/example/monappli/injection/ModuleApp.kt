package com.example.monappli.injection

import com.example.monappli.MainViewModel
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel() }


    }