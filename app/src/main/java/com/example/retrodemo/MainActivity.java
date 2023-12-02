package com.example.retrodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.retrodemo.Model.Example;
import com.example.retrodemo.Model.HomeData;
import com.example.retrodemo.Model.HomeSlider;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData=findViewById(R.id.getData);
        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InstanceClass.callAPI().viewData("1").enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        Log.d("TTT", "onResponse: ="+response.body().getHomeDataList().get(0).getData().get(0).getImage());
                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {

                    }
                });
            }


    });
    }

}