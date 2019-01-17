package com.example.user.foodfix_12.api.model.geo;

/**
 * Created by bagrusss on 17.01.2019
 */
public class GeoObject {

    public final String textAddress;
    public final GeoCoordinates point;

    public GeoObject(String textAddress, GeoCoordinates point) {
        this.textAddress = textAddress;
        this.point = point;
    }

}
