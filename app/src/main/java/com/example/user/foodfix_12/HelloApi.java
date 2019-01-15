package com.example.user.foodfix_12;


import io.reactivex.Single;
import retrofit2.http.GET;

public interface HelloApi {

    @GET("/api/v1/hello")
    Single<HelloMessage> getHelloMessage();

}
