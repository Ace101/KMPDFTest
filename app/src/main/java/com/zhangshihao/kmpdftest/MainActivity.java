package com.zhangshihao.kmpdftest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangshihao.kmpdftest.base.mvp.factory.CreatePresenter;

//@CreatePresenter()
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
