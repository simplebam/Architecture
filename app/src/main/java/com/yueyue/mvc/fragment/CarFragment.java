package com.yueyue.mvc.fragment;

import android.os.Bundle;

import com.yueyue.mvc.R;

/**
 * author : yueyue on 2018/4/13 13:57
 * desc   :
 */
public class CarFragment extends BaseFragment {

    private static final String TAG = "CarFragment";

    public static CarFragment newInstance(String title) {
        CarFragment f = new CarFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        f.setArguments(args);
        return f;
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    public int setFragmentLayoutID() {
        return R.layout.fragment_car;
    }

}
