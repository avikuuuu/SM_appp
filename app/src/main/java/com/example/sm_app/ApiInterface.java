package com.example.sm_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("bhav/all")
    Call<List<PostPojo>> getpost();

}
