package com.example.user.foodfix_12.api.client

import com.example.user.foodfix_12.api.model.geo.GeoObject
import com.example.user.foodfix_12.api.model.response.Response

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by bagrusss on 17.01.2019
 */
interface MapApi {

    @GET("/1.x/") //?format=json&geocode=37.4433,57.22234
    fun getAddressesByCoordinates(@Query("format") format: String = "json", @Query("geocode") lonLat: String): Single<List<GeoObject>>

    @GET("/1.x/")
    fun getAddressesByText(@Query("format") format: String = "json", @Query("geocode") text: String): Single<List<GeoObject>>

}
