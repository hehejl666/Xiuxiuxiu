package com.example.myapplication.Util;


import android.support.annotation.Nullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/2/4.
 */
public interface PhotoFhpxGet {
    String base_url = "https://api.500px.com/v1/";

    @GET("photos")
    Observable<PhotoModel> getPhoto(
            @Query("feature") String feature,
            @Query("user_id") @Nullable String user_id,
            @Query("username") @Nullable String username,
            @Query("only") @Nullable String only,
            @Query("exclude") @Nullable String exclude,
            @Query("sort") @Nullable String sort,
            @Query("sort_direction") @Nullable String sort_direction,
            @Query("page") @Nullable int page,
            @Query("rpp") @Nullable int rpp,
            @Query("image_size") @Nullable int image_size,
            @Query("tags") @Nullable String tags,
            @Query("consumer_key") String consumer_key
    );




    class Create{
        public static PhotoFhpxGet newService(){
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                    .create();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(PhotoFhpxGet.base_url)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
            return retrofit.create(PhotoFhpxGet.class);
        }
    }
}
