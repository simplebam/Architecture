package com.yueyue.mvc.fragment;

import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;

/**
 * author : yueyue on 2018/4/13 13:45
 * desc   : 封装的 DialogFragment 为与 Activity 通信提供接口 OnDialogInteraction
 */
public class BaseDialogFragment extends DialogFragment {

    public interface OnDialogInteraction extends DialogInterface.OnClickListener {

        void onConfirm(DialogInterface dialog, int which);

        void onCancel(DialogInterface dialog, int which);

    }

}