package com.example.ceria.network

import com.example.ceria.data.request.UserProfileRequest
import com.example.ceria.util.NetworkUtil
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber

object ProfileService {
    fun setUserProfile(body: UserProfileRequest) {
        CoroutineScope(Dispatchers.IO).launch {
            // Do the POST request and get response
            val header = NetworkUtil.getGlobalHeader()
            val response = RetrofitClient.newInstance.setUserProfile(body, header)

            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {
                    val userProfileResponse = response.body()
                    if (userProfileResponse != null) {
                        val status = userProfileResponse.success
                        val message = userProfileResponse.message

                        Timber.d("status : $status message : $message")
                    } else {
                        Timber.d("status : ${response.message()}")
                    }
                } else {
                    Timber.d("status : ${response.errorBody()}")
                }
            }
        }
    }
}
