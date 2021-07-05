package com.example.ceria.network

import com.example.ceria.BuildConfig
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private lateinit var ourInstance: Retrofit

    val newInstance: Service
        get() {
            ourInstance = Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .build()

            return ourInstance.create(Service::class.java)
        }

    val instance: Retrofit
        get() {
            if (ourInstance == null) {
                ourInstance = Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
            }
            return ourInstance!!
        }
}
