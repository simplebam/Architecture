package com.yueyue.mvc.fragment;

import android.os.Bundle;
import android.util.Log;

import com.yueyue.mvc.R;

/**
 * author : yueyue on 2018/4/13 13:50
 * desc   :
 */
public class ThinkingFragment extends BaseFragment {

    private static final String TAG = "ThinkingFragment";

    public static ThinkingFragment newInstance(String title) {
        ThinkingFragment f = new ThinkingFragment();
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
        return R.layout.fragment_thinking;
    }

    @Override
    protected void lazyLoadData() {
        super.lazyLoadData();
        if (isViewCreated) {
            Log.e(TAG, "lazyLoadData...");
        }
    }


}
