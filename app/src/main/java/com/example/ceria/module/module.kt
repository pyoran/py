package com.example.ceria.module

import com.example.ceria.data.local.LocalDataSource
import com.example.ceria.data.local.room.MainDatabase
import com.example.ceria.ui.home.HomeViewModel
import com.example.ceria.util.AppExecutors
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val module = module {
    viewModel { (query: String) -> HomeViewModel() }

//    factory<DataRepository> { DataRepositoryImpl(get(), get(), get()) }
//    factory { RemoteDataSource() }
    factory { LocalDataSource(get()) }
    factory { MainDatabase.getInstance(get()).mainDao() }
    factory { AppExecutors() }
}