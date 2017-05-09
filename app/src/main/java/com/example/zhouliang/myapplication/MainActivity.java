package com.example.zhouliang.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.commutils.activity.SecondActivity;
import com.example.commutils.utils.ToActivityUtil;

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
    }

    @OnClick(R.id.bt_start)
    public void onViewClicked() {
        ToActivityUtil.toNextActivity(MainActivity.this, SecondActivity.class);
    }
}
