package com.example.demo.controller;

import com.alibaba.fastjson2.JSON;
import com.example.demo.entity.test;
import com.github.kevinsawicki.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONArray;
import  net.sf.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class dome {

    @GetMapping("test")
    public String cap() throws IOException, InterruptedException {
        try {

            //创建JsonObject第二种方法
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("touser", "OPENID");
            hashMap.put("template_id", "ngqIpbwh8bUfcSsECmogfXcV14J0tQlEpBO27izEYtY");
            hashMap.put("url", "http://weixin.qq.com/download");
            System.out.println("jsonObject2：" + JSONObject.fromObject(hashMap));

            //JsonObject和JsonArray区别就是JsonObject是对象形式，JsonArray是数组形式
            //创建JsonObject第一种方法
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("touser", "OPENID");
            jsonObject.put("template_id", "ngqIpbwh8bUfcSsECmogfXcV14J0tQlEpBO27izEYtY");
            jsonObject.put("url",  "http://weixin.qq.com/download");
            jsonObject.put("topcolor","#FF0000");

            System.out.println("jsonObject1：" + jsonObject);
            //创建一个JsonArray方法1
            JSONArray jsonArray = new JSONArray();
            jsonArray.add(0, "小明");
            jsonArray.add(1, "22");
            jsonArray.add(2, "清华");
            System.out.println("jsonArray1：" + jsonArray);

            //创建JsonArray方法2
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("小明");
            arrayList.add("22");
            arrayList.add("清华");
            System.out.println("jsonArray2：" + JSONArray.fromObject(arrayList));

            //如果JSONArray解析一个HashMap，则会将整个对象的放进一个数组的值中
            System.out.println("jsonArray FROM HASHMAP：" + JSONArray.fromObject(hashMap));

            //组装一个复杂的JSONArray
            JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("UserName", "马衍硕");
            jsonObject2.put("age", "22");
            jsonObject2.put("school", "SDUST");
            jsonObject2.element("students", arrayList);
            System.out.println("jsonObject2：" + jsonObject2);

            System.out.println("get函数返回key(UserName)对应的value："+jsonObject2.get("UserName"));
            System.out.println("get函数返回key(students)对应的value：      "+jsonObject2.get("students"));



        }catch(Exception e) {
            e.printStackTrace();
        }
        return "内网穿透完成";
    }
}
