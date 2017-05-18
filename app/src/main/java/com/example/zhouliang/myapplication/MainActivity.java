package com.example.zhouliang.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.chenenyu.router.RouteTable;
import com.chenenyu.router.Router;
import com.example.commutils.activity.ThreeActivity;

import java.util.Map;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.bt_start)
    Button btStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        Router.addRouteTable(new RouteTable() {
            @Override
            public void handle(Map<String, Class<?>> map) {
                map.put("three", ThreeActivity.class);
            }
        });
    }

    @OnClick(R.id.bt_start)
    public void onViewClicked() {
//        startActivity(Router.build("first").getIntent(this));
        Router.build("three").go(this);
//        Router.build("first").callback(new RouteCallback() { // 添加结果回调
//            @Override
//            public void callback(RouteResult state, Uri uri, String message) {
//                if (state == RouteResult.SUCCEED) {
//                    Toast.makeText(MainActivity.this, "succeed: " + uri.toString(), Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "error: " + uri + ", " + message, Toast.LENGTH_SHORT).show();
//                }
//            }
//        }).go(this);
//        ToActivityUtil.toNextActivity(MainActivity.this, SecondActivity.class);
    }
}
