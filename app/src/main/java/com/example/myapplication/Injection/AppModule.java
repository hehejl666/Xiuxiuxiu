package com.example.myapplication.Injection;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 17930 on 2016/2/24.
 */
@Module
public class AppModule {
    protected Application mAplication;

    public AppModule(Application mAplication) {
        this.mAplication = mAplication;
    }

    @Provides
    @AppContext
    Context providesContext(){
        return  mAplication;
    }


    @Provides
    Application providesApplicaiton(){
        return  mAplication;
    }
}
