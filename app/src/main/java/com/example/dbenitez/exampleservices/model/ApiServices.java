package com.example.dbenitez.exampleservices.model;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by dbenitez on 3/27/2018.
 */

public interface ApiServices {



    @Headers("api_key:es_cinepolis_test_android")
    @GET("/v2/schedules?country_code=ES&cities=32&include_cinemas=true&include_movies=true")
    Call<Schedules> getMembersLoyalty();


}
