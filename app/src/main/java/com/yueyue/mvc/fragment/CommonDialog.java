package com.yueyue.mvc.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;

/**
 * author : yueyue on 2018/4/13 13:46
 * desc   :
 */
public class CommonDialog extends BaseDialogFragment {

    private static final String TITLE = "title";
    private static final String MESSAGE = "message";
    private static final String POSITIVE = "positive";
    private static final String NEGATIVE = "negative";
    private static final String CANCELABLE = "cancelable";

    private static OnDialogInteraction mListener;

    public CommonDialog() {
        // Required empty public constructor
    }

    public static CommonDialog newInstance(String title, String message,
                                           String positive, String negative,
                                           boolean cancelable, OnDialogInteraction listener) {
        CommonDialog f = new CommonDialog();
        Bundle args = new Bundle();
        args.putString(TITLE, title);
        args.putString(MESSAGE, message);
        args.putString(POSITIVE, positive);
        args.putString(NEGATIVE, negative);
        args.putBoolean(CANCELABLE, cancelable);
        mListener = listener;
        f.setArguments(args);
        return f;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Bundle arguments = getArguments();
        String title = arguments.getString(TITLE);
        String message = arguments.getString(MESSAGE);
        String positive = arguments.getString(POSITIVE);
        String negative = arguments.getString(NEGATIVE);
        boolean cancelable = arguments.getBoolean(CANCELABLE);

        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton(positive, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (mListener != null) {
                            mListener.onConfirm(dialogInterface, i);
                        }
                    }
                })
                .setNegativeButton(negative, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (mListener != null) {
                            mListener.onCancel(dialogInterface, i);
                        }
                    }
                });
        setCancelable(cancelable);
        builder.create().setCanceledOnTouchOutside(false);
        return builder.create();
    }

}
