package com.ks.hihi.haha.request;

import com.ks.hihi.haha.items.BaseObj;
import com.ks.hihi.haha.utill.Config;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by jo on 2017-05-01.
 */

public interface RequestList {

    interface selectList {
        @Headers({
                "Accept: application/json",
        })
        @GET("/rest/{gubun}/list")
        Call<List<BaseObj>> createTask(@Path("gubun") String gubun);

    }

    Retrofit retrofitHttp = new Retrofit.Builder()
            .baseUrl(Config.BASE_RUL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    Retrofit retrofitHttps = new Retrofit.Builder()
            .baseUrl(Config.BASE_RUL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
