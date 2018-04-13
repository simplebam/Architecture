package com.yueyue.mvc.fragment;

import android.os.Bundle;

import com.yueyue.mvc.R;

/**
 * author : yueyue on 2018/4/13 13:55
 * desc   :
 */
public class MusicFragment extends BaseFragment {

    private static final String TAG = "MusicFragment";

    public static MusicFragment newInstance(String title) {
        MusicFragment f = new MusicFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        f.setArguments(args);
        return f;
    }

    @Override
    public int setFragmentLayoutID() {
        return R.layout.fragment_music;
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
}
