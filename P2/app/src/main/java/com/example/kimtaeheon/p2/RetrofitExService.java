package com.example.kimtaeheon.p2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitExService {
    String URL = "http://167.99.153.44:8000";

    @GET("/shop")
    Call<List<Product>> getItem();
    //Call<List<Product>> getItem(@Query("busan") String productName);

    @GET("/shop")
    Call<List<Product>> getLocation();

}
