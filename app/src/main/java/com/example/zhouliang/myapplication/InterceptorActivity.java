package com.example.zhouliang.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.chenenyu.router.annotation.Route;

/**
 * Created by zhouliang on 2017/5/18.
 */
@Route(value = "intercepted", interceptors = "LoginInterceptor")
public class InterceptorActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TextView view = new TextView(this);
//        view.setText("this intercepted");
//        setContentView(view);
    }
}
