package com.example.user.foodfix_12.api.serializers;

import com.example.user.foodfix_12.api.model.geo.GeoCoordinates;
import com.example.user.foodfix_12.api.model.geo.GeoObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bagrusss on 17.01.2019
 */
public class GeoObjectListDeserializer implements JsonDeserializer<List<GeoObject>> {

    @Override
    public List<GeoObject> deserialize(JsonElement json,
                                       Type typeOfT,
                                       JsonDeserializationContext context) throws JsonParseException {

        JsonObject geoCollection = json.getAsJsonObject().get("response")
                .getAsJsonObject().get("GeoObjectCollection")
                .getAsJsonObject();

        int size = geoCollection.get("metaDataProperty")
                .getAsJsonObject().get("GeocoderResponseMetaData")
                .getAsJsonObject().get("found")
                .getAsInt();

        JsonArray members = geoCollection.get("featureMember")
                .getAsJsonArray();

        final List<GeoObject> list = new ArrayList<>(size);
        String textAddress;
        JsonObject mapsGeoObject;
        for (JsonElement member : members) {
            mapsGeoObject = member.getAsJsonObject()
                    .get("GeoObject")
                    .getAsJsonObject();

            textAddress = mapsGeoObject.getAsJsonObject().get("metaDataProperty")
                    .getAsJsonObject().get("GeocoderMetaData")
                    .getAsJsonObject().get("AddressDetails")
                    .getAsJsonObject().get("Country")
                    .getAsJsonObject().get("AddressLine")
                    .getAsString();

            String[] coordinates = mapsGeoObject.get("Point").getAsJsonObject()
                    .get("pos").getAsString()
                    .split(" ");

            GeoCoordinates geoCoordinates = new GeoCoordinates(Double.valueOf(coordinates[0]), Double.valueOf(coordinates[1]));
            GeoObject geoObject = new GeoObject(textAddress, geoCoordinates);
            list.add(geoObject);
        }

        return list;
    }
}
