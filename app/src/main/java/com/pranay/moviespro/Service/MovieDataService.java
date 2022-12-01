package com.pranay.moviespro.Service;

import com.pranay.moviespro.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key")String apiKey);
}
