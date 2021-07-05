package com.example.ceria.util

import com.example.ceria.BuildConfig

object NetworkUtil {
    fun getGlobalHeader(): HashMap<String, String> {
        val header = HashMap<String, String>()
        header["key"] = BuildConfig.CONSUMER_KEY
        header["secret"] = BuildConfig.CONSUMER_SECRET
        return header
    }
}
