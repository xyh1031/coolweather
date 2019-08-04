package com.coolweather.android.gson;

/**
 * Created by xuyuhan on 2019/8/4.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
