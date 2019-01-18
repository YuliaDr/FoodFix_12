package com.example.user.foodfix_12

/**
 * Created by bagrusss on 17.01.2019
 */
interface DataReceiver<D> {
    fun onData(data: D)
}