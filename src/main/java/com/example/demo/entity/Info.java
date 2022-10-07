package com.example.demo.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Info {
    String key="";
    String value="";
    String color="";
    Map<String,Object> data = new HashMap();
    Map<String,String> info = new HashMap();
}
