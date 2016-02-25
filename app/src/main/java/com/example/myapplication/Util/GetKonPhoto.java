package com.example.myapplication.Util;

import com.example.myapplication.Moudle.KonachanPost;
import com.example.myapplication.UI.Interface.IgetxmlFragment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by 17930 on 2016/2/25.
 */
public interface GetKonPhoto {
    String base_url = "http://konachan.net/";

    @GET("post.json")
    Observable<KonachanPost> getkonPto(

    );


    class Create{
        public static GetKonPhoto newService(){
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                    .create();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(GetKonPhoto.base_url)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
            return retrofit.create(GetKonPhoto.class);
        }
    }

}
