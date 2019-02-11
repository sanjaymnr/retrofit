package com.example.user.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Call<List<Modal>> questionModelCall = ApiService.getServiceClass().getAllData();
        questionModelCall.enqueue(new Callback<List<Modal>>() {
            @Override
            public void onResponse(Call<List<Modal>> call, Response<List<Modal>> response) {
                if (response.isSuccessful()) {
                    for (int i = 0; i < response.body().size(); i++) {
                        String category = response.body().get(i).category;
                        String instructions = response.body().get(i).instructions;
                        String name = response.body().get(i).name;
                        String photo = response.body().get(i).photo;
                        Double price = response.body().get(i).price;
                        Integer productId = response.body().get(i).productId;
                        Toast.makeText(MainActivity.this, "productID...." + productId + "...name... " + name + "...category..." + category
                                + "...instructions..." + instructions + "...photo..." + photo + "...price..." + price, Toast.LENGTH_SHORT).show();
                        System.out.println("productID...." + productId + "...name... " + name + "...category..." + category
                                + "...instructions..." + instructions + "...photo..." + photo + "...price..." + price);
                    }

                }
            }

            @Override
            public void onFailure(Call<List<Modal>> call, Throwable t) {

            }
        });
    }


}
