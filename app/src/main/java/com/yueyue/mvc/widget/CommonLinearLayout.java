package com.yueyue.mvc.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;

/**
 * author : yueyue on 2018/4/13 11:31
 * desc   :
 */
public class CommonLinearLayout extends LinearLayout {
    public CommonLinearLayout(Context context) {
        this(context, null);
    }

    public CommonLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CommonLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (isKeyboardShown(this)) {

        }
    }

    /**
     * 监听软键盘事件
     *
     * @param rootView
     * @return
     */
    private boolean isKeyboardShown(View rootView) {
        final int softKeyboardHeight = 100;
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        DisplayMetrics displayMetrics = rootView.getResources().getDisplayMetrics();
        int heightDiff = rootView.getBottom() - rect.bottom;
        return heightDiff > softKeyboardHeight * displayMetrics.density;
    }

}
