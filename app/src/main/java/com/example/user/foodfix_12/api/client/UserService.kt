package com.example.user.foodfix_12.api.client

import com.example.user.foodfix_12.api.model.request.AuthRequest
import com.example.user.foodfix_12.api.model.request.ConfirmRegRequest
import com.example.user.foodfix_12.api.model.request.RegistrationRequest
import com.example.user.foodfix_12.api.model.response.ConfirmationResponse
import com.example.user.foodfix_12.api.model.response.RegistrationResponse
import com.example.user.foodfix_12.api.model.response.Response

import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by bagrusss on 17.01.2019
 */
interface UserService {

    @POST("auth/confirmation")
    fun regusterUser(@Body request: RegistrationRequest): Single<Response<RegistrationResponse>>

    @POST("auth/confirm")
    fun condirmUser(@Body request: ConfirmRegRequest): Single<Response<ConfirmationResponse>>

    @POST("auth")
    fun auth(@Body request: AuthRequest): Single<Response<ConfirmationResponse>>

}
