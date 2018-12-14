package com.rdafoxy.abhi.mydemos;

/**
 * Created by Abhi on 14/12/18 - 9:24 AM.
 */
public enum ModelObject {

    RED(R.string.app_name, R.layout.view_red),
    BLUE(R.string.app_name, R.layout.view_blue),
    GREEN(R.string.app_name, R.layout.view_red);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
