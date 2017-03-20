package com.suninfo.commonlibrary.router;

import android.content.Intent;

/**
 * author: zh on 2017/3/17.
 */

public interface RouterB {
    @RouterUri("suninfo://host_b")
    public Intent getIntentActivityB(@RouterParamters("name") String name);
}
