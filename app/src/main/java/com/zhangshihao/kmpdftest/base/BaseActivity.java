package com.zhangshihao.kmpdftest.base;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;

/**
 * @author:zhangshihao
 * @date:2019/2/26
 * @description:
 */
@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity  {

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            KMReaderConfigs.IS_PORTRAIT = false;
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
//            KMReaderConfigs.IS_PORTRAIT = true;
        }
    }

}
