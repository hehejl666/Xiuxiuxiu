package com.example.myapplication.Injection;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by 17930 on 2016/2/24.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
}
