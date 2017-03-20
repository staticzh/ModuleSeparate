package com.suninfo.commonlibrary;

import android.content.Context;

/**
 * author: zh on 2017/3/17.
 */

public class AppContext {
    private static Context mContext;
    public static void init(Context context){
        mContext = context;
    }
    public static Context getContext(){
        if(mContext == null){
            throw new IllegalStateException("forget init?");
        }else {
            return mContext;
        }


    }
}
