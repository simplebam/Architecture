package com.yueyue.mvc.fragment;

import android.os.Bundle;

import com.yueyue.mvc.R;

/**
 * author : yueyue on 2018/4/13 13:49
 * desc   :
 */
public class BusinessFragment extends BaseFragment {

    private static final String TAG = "BusinessFragment";

    public static BusinessFragment newInstance(String title) {
        BusinessFragment f = new BusinessFragment();
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
        isViewCreated = true;
    }

    @Override
    protected void initView() {

    }

    @Override
    public int setFragmentLayoutID() {
        return R.layout.fragment_business;
    }

    @Override
    protected void lazyLoadData() {
        super.lazyLoadData();
        if (isViewCreated) {

        }
    }
}
