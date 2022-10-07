package com.example.demo.entity;
import com.alibaba.fastjson2.JSON;
import com.example.demo.entity.Info;

import java.util.HashMap;
import java.util.Map;

public class test {

    static public Map craeMap(String key,String value,String color)
    {

        Info info = new Info();
        info.key=key;
        info.color=value;
        info.value=color;
        info.info.put("value",info.value);
        info.info.put("color",info.color);
        info.data.put(info.key, info.info);
        Map datareturn = new HashMap();
        datareturn.put("data",info.data);
        return datareturn;
    }

}
