package com.example.user.retrofit;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public class ApiService {

    private static final String BASE_URL = "http://services.hanselandpetal.com/";

    public static RetrofitInterface getServiceClass() {
        return RetrofitAPI.getRetrofit(BASE_URL)
                .create(RetrofitInterface.class);
    }

    public interface RetrofitInterface {
        @GET("feeds/flowers.json")
        public Call<List<Modal>> getAllJavaQuestions();
    }
}

