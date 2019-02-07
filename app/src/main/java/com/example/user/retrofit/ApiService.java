//package com.example.user.retrofit;
//
//
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.http.GET;
//
//
//public class ApiService {
//
//    private static final String BASE_URL = "https://api.myjson.com/";
//
//    public static RetrofitInterface getServiceClass() {
//        return RetrofitAPI.getRetrofit(BASE_URL)
//                .create(RetrofitInterface.class);
//    }
//
//    public interface RetrofitInterface {
//        @GET("bins/1bsqcn1")
//        public Call<List<Model>> getAllData();
//    }
//}
//
///*private static final String BASE_URL = "http://192.168.137.1/";
//
//    public static RetrofitInterface getServiceClass() {
//        return RetrofitAPI.getRetrofit(BASE_URL)
//                .create(RetrofitInterface.class);
//    }
//
//    public interface RetrofitInterface {
//        @GET("qrce/java.php")
//        public Call<List<QuestionModel>> getAllJavaQuestions();
//    }*/