package com.suninfo.commonlibrary.router;

import android.content.Intent;

/**
 * author: zh on 2017/3/17.
 */

public interface RouterA {
    @RouterUri("suninfo://host_a")
    public Intent getIntentActivityA(@RouterParamters("name") String name);
}
