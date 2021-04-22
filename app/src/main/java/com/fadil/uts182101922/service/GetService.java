package com.fadil.uts182101922.service;

import com.fadil.uts182101922.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface GetService {
    @GET("users")
    Call<List<User>> getUsersList();
}
