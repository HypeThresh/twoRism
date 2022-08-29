package com.example.tworism.Retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserInterface {
    @FormUrlEncoded
    @POST("/api/users/login")
    Call<UserModel> login(@Field("UserEmail") String UserEmail, @Field("UserPassword") String UserPassword);
}