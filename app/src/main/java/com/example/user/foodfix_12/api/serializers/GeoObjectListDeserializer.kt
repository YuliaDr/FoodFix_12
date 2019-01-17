package com.example.user.foodfix_12.api.serializers

import com.example.user.foodfix_12.api.model.geo.GeoCoordinates
import com.example.user.foodfix_12.api.model.geo.GeoList
import com.example.user.foodfix_12.api.model.geo.GeoObject
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonObject

import java.lang.reflect.Type
import java.util.ArrayList

/**
 * Created by bagrusss on 17.01.2019
 */
class GeoObjectListDeserializer : JsonDeserializer<GeoList> {

    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext?): GeoList {
        val geoCollection = json.asJsonObject["response"]
                .asJsonObject["GeoObjectCollection"].asJsonObject

        val size = geoCollection["metaDataProperty"]
                .asJsonObject["GeocoderResponseMetaData"]
                .asJsonObject["results"]
                .asInt
        val members = geoCollection["featureMember"].asJsonArray
        val list = GeoList(size)
        var textAddress: String
        var mapsGeoObject: JsonObject
        members.forEach { member ->
            mapsGeoObject = member.asJsonObject["GeoObject"].asJsonObject

            textAddress = mapsGeoObject
                    .asJsonObject["metaDataProperty"]
                    .asJsonObject["GeocoderMetaData"]
                    .asJsonObject["AddressDetails"]
                    .asJsonObject["Country"]
                    .asJsonObject["AddressLine"]
                    .asString
            val coordinates = mapsGeoObject["Point"].asJsonObject["pos"].asString.split(" ")
            val point = GeoCoordinates(coordinates[1].toDouble(), coordinates.first().toDouble())
            val geoObject = GeoObject(textAddress, point)
            list.add(geoObject)
        }
        return list
    }

}
