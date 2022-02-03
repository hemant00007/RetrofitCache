package com.example.retrofit_cache;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("abab7ab4-b3bd-4e65-85a5-7663478cee94")
    Call<List<Partner>> getData();
}
