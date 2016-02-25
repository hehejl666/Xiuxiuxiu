package com.example.myapplication.Util;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.App;
import com.example.myapplication.Moudle.KonPhotos;
import com.example.myapplication.UI.Interface.IgetxmlFragment;
import com.google.gson.Gson;

/**
 * Created by 17930 on 2016/2/25.
 */
public class GetKonXiuXiu {
       static String base_url="http://konachan.net/";

    public GetKonXiuXiu(IgetxmlFragment igetxmlFragment) {
        this.igetxmlFragment = igetxmlFragment;
    }

    IgetxmlFragment igetxmlFragment;
    public  void volleyGet(){
        String dosomething="post.json";
        RequestQueue req= Volley.newRequestQueue(App.getmContext());
        StringRequest request=new StringRequest(Request.Method.GET, GetKonXiuXiu.base_url+dosomething, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                String getjson="{\"photos\":"+response.toString()+"}";
               Gson gson=  new Gson();

                KonPhotos g = gson.fromJson(getjson, KonPhotos.class);
                Log.e("e", g.getPhotos().get(1).getSampleUrl()+"");
                igetxmlFragment.SetKonPotos(g);
            }
        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        req.add(request);
    }
}
