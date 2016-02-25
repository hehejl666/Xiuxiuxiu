package com.example.myapplication;

import android.app.Application;
import android.content.Context;

import com.example.myapplication.Injection.AppComponent;
import com.example.myapplication.Injection.AppModule;
import com.example.myapplication.Injection.DaggerAppComponent;

/**
 * Created by 17930 on 2016/2/24.
 */
public class App extends Application {
    private AppComponent mAppComponent;
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();
    }

    public static Context getmContext() {
        return mContext;
    }
    public static App get(Context context){
        return (App)context.getApplicationContext();
    }

    public AppComponent getmAppComponent() {
        if (mAppComponent==null){
            mAppComponent=DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        }
        return mAppComponent;
    }
}
