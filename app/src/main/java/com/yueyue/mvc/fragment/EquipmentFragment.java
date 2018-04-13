package com.yueyue.mvc.fragment;

import android.os.Bundle;
import android.util.Log;

import com.yueyue.mvc.R;

/**
 * author : yueyue on 2018/4/13 13:48
 * desc   :
 */
public class EquipmentFragment extends BaseFragment {

    private static final String TAG = "EquipmentFragment";

    public static EquipmentFragment newInstance(String title) {
        EquipmentFragment f = new EquipmentFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        f.setArguments(args);
        return f;
    }


    @Override
    public int setFragmentLayoutID() {
        return R.layout.fragment_equipment;
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
    protected void lazyLoadData() {
        super.lazyLoadData();
        if (isViewCreated) {
            Log.e(TAG, "lazyLoadData...");
        }
    }

}
