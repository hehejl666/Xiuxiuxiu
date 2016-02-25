package com.example.myapplication.Injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by 17930 on 2016/2/24.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface AppContext {
}
