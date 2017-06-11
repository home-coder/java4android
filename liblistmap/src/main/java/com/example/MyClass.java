package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyClass {
    public static void main(String args[]) {
        List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();
        Map<String, String> map1 = new HashMap<String, String>();
        Map<String, String> map2 = new HashMap<String, String>();
        Map<String, String> map3 = new HashMap<String, String>();

        map1.put("key1", "value1");
        map2.put("key2", "value2");
        map3.put("key3", "value3");
        listMap.add(map1);
        listMap.add(map2);
        listMap.add(map3);

        String p = listMap.get(2).get("key3");
        System.out.println("key2 = " + p);

        List<String> listStr = new ArrayList<String>();
        String str1 = "helloworld";
        String str2 = "which one";
        listStr.add(str1);
        listStr.add(str2);
        String showStr = listStr.get(1);
        System.out.println(showStr);
    }
}
