package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CHW on 2018/6/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
