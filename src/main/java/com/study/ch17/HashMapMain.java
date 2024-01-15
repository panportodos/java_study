package com.study.ch17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("username", "junil");
        map.put("password", "1234");
        map.put("name", "김준일");
        map.put("email", "skjil1218@kakao.com");

        System.out.println(map);
        System.out.println(map.get("email"));

        Set<String> setKey = map.keySet();
        for(String keyName : setKey) {
            System.out.println(keyName);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }

        map.forEach((k, v) -> {
            System.out.println("key: " + k);
            System.out.println("value: " + v);
        });
    }
}
