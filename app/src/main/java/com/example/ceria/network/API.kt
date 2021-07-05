package com.example.ceria.network

import com.example.ceria.BuildConfig

object API {
    const val v1 = "v1/"
    const val BASE_URL = BuildConfig.BASE_URL

    // inside of any of your application's code
    var consumerKey: String = BuildConfig.CONSUMER_KEY
    var consumerSecret: String = BuildConfig.CONSUMER_SECRET

    const val PHONE = "phone_number"
    const val PIN = "pin"
    const val SEARCH = "search"
    const val USERS = "users"
    const val USER_PROFILE = "user/profile"
}
