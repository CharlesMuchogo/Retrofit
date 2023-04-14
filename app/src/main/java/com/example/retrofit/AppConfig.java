package com.example.retrofit;

import static android.content.ContentValues.TAG;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class AppConfig {

    private static final String BASE_URL = "http://192.168.80.27:8080/";

    static Retrofit getRetrofit() {
        Log.d(TAG, "getRetrofit: "+BASE_URL);

        return new Retrofit.Builder()
                .baseUrl(AppConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
