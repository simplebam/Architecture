package com.yueyue.mvc.common;

import android.os.Handler;

import com.yueyue.mvc.listener.HandlerContainer;

import java.lang.ref.WeakReference;

/**
 * author : yueyue on 2018/4/13 14:07
 * desc   :
 */
public class SafeHandler<T extends HandlerContainer> extends Handler {
    protected WeakReference<T> mRef;

    public SafeHandler(WeakReference<T> ref) {
        mRef = ref;
    }

    public SafeHandler(T obj) {
        mRef = new WeakReference<>(obj);
    }

    public T getContainer() {
        return mRef.get();
    }

    @Override
    public void handleMessage(android.os.Message msg) {
        super.handleMessage(msg);
        HandlerContainer container = getContainer();
        if (container != null) {
            container.handleMessage(msg);
        }
    }
}
