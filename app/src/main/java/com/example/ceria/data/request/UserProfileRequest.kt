package com.example.ceria.data.request

import com.google.gson.annotations.SerializedName

data class UserProfileRequest(
    @SerializedName("credit_card_bank")
    val creditCardBank: String,
    @SerializedName("e_mail")
    val eMail: String,
    val edu: String,
    @SerializedName("marital_status")
    val maritalStatus: String,
    @SerializedName("phone_home")
    val phoneHome: String,
    @SerializedName("users_id")
    val usersId: String
)