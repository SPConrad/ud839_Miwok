package com.example.android.miwok;

import android.content.Context;

/**
 * Created by Sean on 3/26/2017.
 */

public class TextView {
    private String mText;

    private int mTextColor;

    private Context mContext;

    public TextView(Context context) {
        mText = "";
        mTextColor = 0;
        mContext = context;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getText() {
        return mText;
    }

    public void setColor(int color) {
        mTextColor = color;
    }

    public int getColor() {
        return mTextColor;
    }

    public void setContext(Context context) {
        mContext = context;
    }

    public Context getContex() {
        return mContext;
    }
}
