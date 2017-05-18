package com.example.zhouliang.myapplication;


import android.content.Context;

import com.chenenyu.router.RouteInterceptor;
import com.chenenyu.router.RouteRequest;
import com.chenenyu.router.Router;
import com.chenenyu.router.annotation.Interceptor;

/**
 * Created by zhouliang on 2017/5/18.
 */
@Interceptor("LoginInterceptor")
public class LoginInterceptor implements RouteInterceptor {
    private int tag = 0;
    @Override
    public boolean intercept(Context context, RouteRequest routeRequest) {
        if(tag == 0){
            Router.build("secound").go(context);
            return false;
        }else{
            return true;
        }
    }
}
