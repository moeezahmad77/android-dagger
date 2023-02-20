package com.example.java_application.dagger_mvvm.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.java_application.dagger_mvvm.models.Product;
import com.example.java_application.dagger_mvvm.retrofit.FakerApi;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductRepo {
    private String TAG = "PROD_REPO";
    FakerApi fakerApi;
    private MutableLiveData<List<Product>> _products = new MutableLiveData<>();
    public LiveData<List<Product>> products = _products;

    @Inject
    public ProductRepo(FakerApi fakerApi) {
        this.fakerApi = fakerApi;
    }

    public void getProducts() {
        fakerApi.getProducts().enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if(response.isSuccessful()) {
                    if(response.code() == 200) {
                        _products.postValue(response.body());
                    } else {
                        _products.postValue(null);
                    }
                } else {
                    Log.d(TAG, response.message());
                    _products.postValue(null);
                }
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Log.d(TAG, t.getMessage());
                _products.postValue(null);
            }
        });
    }
}