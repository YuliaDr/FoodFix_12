package com.example.user.foodfix_12.api.model.request

import com.example.user.foodfix_12.api.model.User

/**
 * Created by bagrusss on 17.01.2019
 */
class RegistrationRequest(firstName: String,
                          lastName: String,
                          middleName: String?,
                          phone: String,
                          @JvmField val password: String) : User(firstName, lastName, middleName, phone)
