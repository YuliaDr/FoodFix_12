package com.example.user.foodfix_12.net

import com.example.user.foodfix_12.api.model.geo.GeoObject
import com.example.user.foodfix_12.api.serializers.GeoObjectListDeserializer
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by bagrusss on 17.01.2019
 */
object Net {

    private const val GEO_URL = "https://geocode-maps.yandex.ru"
    private const val URL = "http://95.163.181.207/api.v1"

    private val client = OkHttpClient.Builder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build()

    private val gson = GsonBuilder().registerTypeAdapter(object : TypeToken<List<GeoObject>>() {}.type, GeoObjectListDeserializer())
                                    .setLenient()
                                    .create()

    private val geoRetrofit = Retrofit.Builder()
            .client(client)
            .baseUrl(GEO_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

    private val retrofit = geoRetrofit.newBuilder()
                                      .baseUrl(URL)
                                      .build()

    @JvmField
    val netContext = ApiContext(geoRetrofit, retrofit)
}
