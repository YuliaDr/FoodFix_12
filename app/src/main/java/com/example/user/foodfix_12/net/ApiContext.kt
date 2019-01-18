package com.example.user.foodfix_12.net

import com.example.user.foodfix_12.api.client.MapApi
import com.example.user.foodfix_12.api.client.UserService
import retrofit2.Retrofit

/**
 * Created by bagrusss on 17.01.2019
 */
class ApiContext(geoRetrofit: Retrofit,
                 retrofit: Retrofit) {

    @JvmField val geoApi = geoRetrofit.create(MapApi::class.java)

    @JvmField val userApi = retrofit.create(UserService::class.java)
}