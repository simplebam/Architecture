package com.yueyue.mvc.listener;

import android.os.Message;

/**
 * author : yueyue on 2018/4/13 14:07
 * desc   : 表示Handler所在的容器(类), 通常是Activity或Fragment.
 */
public interface HandlerContainer {
    void handleMessage(Message msg);
}

