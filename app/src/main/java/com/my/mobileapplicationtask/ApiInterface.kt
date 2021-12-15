package com.my.mobileapplicationtask

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterface {
    @Headers("Content-Type: application/json")
    @POST("login")
    fun postData(@Body users:UserData): Call<loginData>
}

interface RegisterApiInterface {
    @Headers("Content-Type: application/json")
    @POST("/register")
    fun postRegData(@Body reg:UserData): Call<RegisterDataClass>
}