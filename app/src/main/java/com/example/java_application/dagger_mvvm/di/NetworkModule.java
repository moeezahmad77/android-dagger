package com.example.java_application.dagger_mvvm.di;

import com.example.java_application.dagger_mvvm.retrofit.FakerApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    String BASE_URL = "https://fakestoreapi.com";

    @Singleton
    @Provides
    public Retrofit providesRetrofit() {
        return new Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    public FakerApi providesFakerApi(Retrofit retrofit) {
        return retrofit.create(FakerApi.class);
    }
}
