package com.example.retrodemo;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InstanceClass {
    public static Retro_Interface callAPI()
    {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://myrewardwallet.com/App/api100/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Retro_Interface service = retrofit.create(Retro_Interface.class);
        return service;
    }
}