package com.example.user.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private OkHttpClient okHttpClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Call<List<Modal>> questionModelCall=ApiService.getServiceClass().getAllJavaQuestions();
        questionModelCall.enqueue(new Callback<List<Modal>>() {
            @Override
            public void onResponse(Call<List<Modal>> call, Response<List<Modal>> response) {

            }

            @Override
            public void onFailure(Call<List<Modal>> call, Throwable t) {

            }
        });
    }


}
