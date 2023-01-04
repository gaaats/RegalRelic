package com.ferrero.appla.serrvice

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface SsssserviceApi {

    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJSfrr>

    @GET("constaaa.json")
    suspend fun getDataDev(): Response<GeoDevfrfrrf>
}

@Keep
data class CountryCodeJSfrr(
    @SerializedName("city")
    val gtgtgt: String,
    @SerializedName("country")
    val hyjuji: String,
    @SerializedName("countryCode")
    val countryCodefgtgt56556gtgt: String,
)


