package com.suninfo.commonlibrary;

import com.google.gson.Gson;

/**
 * author: zh on 2017/3/17.
 */

public class GsonInstance {
    private static Gson sInstance = new Gson();

    private GsonInstance() {
    }

    public static Gson getInstance() {
        Gson gson = new Gson();
        sInstance = gson;
        return sInstance;
    }
}
