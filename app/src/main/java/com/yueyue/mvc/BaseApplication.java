package com.yueyue.mvc;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatDelegate;

import com.yueyue.mvc.utils.ToastUtils;

/**
 * author : yueyue on 2018/4/13 10:38
 * desc   :
 */
public class BaseApplication extends Application {

    @SuppressLint("StaticFieldLeak")
    private static Context sContext;

    // TODO: 16/12/1 这里的夜间模式 UI 有些没有适配好 暂时放弃夜间模式
    static {
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_NO);
    }


    @Override
    public void onCreate() {
        super.onCreate();
        sContext=this;


        ToastUtils.init(true);

    }

    public static Context getContext() {
        return sContext;
    }
}
