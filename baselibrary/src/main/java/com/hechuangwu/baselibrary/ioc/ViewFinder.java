package com.hechuangwu.baselibrary.ioc;

import android.app.Activity;
import android.view.View;

/**
 * Created by cwh on 2019/9/19 0019.
 * 功能:
 */
public class ViewFinder {
    private Activity activity;
    private View view;

    public ViewFinder(View view) {
        this.view = view;
    }

    public ViewFinder(Activity activity) {
        this.activity = activity;
    }

    public View  findViewById(int viewId){
        return this.activity!=null?activity.findViewById(viewId):view.findViewById(viewId);

    }
}
