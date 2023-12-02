package com.example.retrodemo;

import com.example.retrodemo.Model.Example;
import com.example.retrodemo.Model.HomeData;
import com.example.retrodemo.Model.HomeSlider;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Retro_Interface {
    @FormUrlEncoded
    @POST("HomeData")
    Call<Example> viewData(@Field("id")String id);
}