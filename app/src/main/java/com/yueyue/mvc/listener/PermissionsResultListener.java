package com.yueyue.mvc.listener;

/**
 * author : yueyue on 2018/4/13 10:46
 * desc   :
 */
public interface PermissionsResultListener {

    void onPermissionGranted();

    void onPermissionDenied();

}

