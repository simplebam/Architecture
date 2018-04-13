package com.yueyue.mvc.utils;

import android.content.Context;

import com.yueyue.mvc.BaseApplication;

/**
 * author : yueyue on 2018/4/13 10:42
 * desc   :
 */
public class SDUtil {
    /**
     * 如果存在SD卡则将缓存写入SD卡,否则写入手机内存
     */
    public static String getCachePath(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }

        String cacheDir;
        if (context.getExternalCacheDir() != null && ExistSDCard()) {
            cacheDir = context.getExternalCacheDir().toString();
        } else {
            cacheDir = context.getCacheDir().toString();
        }
        return cacheDir;
    }

    private static boolean ExistSDCard() {
        return android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED);
    }

}
