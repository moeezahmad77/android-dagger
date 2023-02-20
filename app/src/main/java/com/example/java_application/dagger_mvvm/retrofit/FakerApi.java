package com.example.java_application.dagger_mvvm.retrofit;

import com.example.java_application.dagger_mvvm.models.Product;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface FakerApi {

    @GET("/products")
    Call<List<Product>> getProducts();

}
