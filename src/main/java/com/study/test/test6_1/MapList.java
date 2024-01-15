package com.study.test.test6_1;

import java.util.*;

import java.util.HashMap;

public class MapList {

            public static void main(String[] args) {
                List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();

                Map<String, Object> customer1 = new LinkedHashMap<>();
                customer1.put("name", "홍길동");
                customer1.put("grade", "vip");
                customer1.put("age", 30);

                Map<String, Object> customer2 = new LinkedHashMap<>();
                customer2.put("name", "김기영");
                customer2.put("grade", "gold");
                customer2.put("age", 35);

                customers.add(customer1);
                customers.add(customer2);

                for (Map<String, Object> customer : customers) {
                    for (Map.Entry<String, Object> entry : customer.entrySet()) {
                        System.out.println(entry.getKey() + "=" + entry.getValue());
                    }
                }
            }
        }
