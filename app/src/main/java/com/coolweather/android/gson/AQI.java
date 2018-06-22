package com.coolweather.android.gson;

/**
 * Created by CHW on 2018/6/13.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
