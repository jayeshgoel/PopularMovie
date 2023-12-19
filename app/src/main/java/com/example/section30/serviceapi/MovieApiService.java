package com.example.section30.serviceapi;

import com.example.section30.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    // The service interface defines the structure
    // and behaviour of the API requests.
    // Acts as a bridge between your app and the API

    @GET("movie/popular")
    Call<Result> getPopularMoves(@Query("api_key") String apiKey);
}
