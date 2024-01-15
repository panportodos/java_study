package com.study.ch17;

import java.lang.reflect.Array;
import java.util.*;

public class HashSetMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add("김준이");

        System.out.println(nameList);

        HashSet<String> names = new HashSet<>();
        names.addAll(nameList);

        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        newNameList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Objects.hash(o1) - Objects.hash(o2);
            }
        });
        System.out.println(newNameList);

        String findName = null;

        for(String name : names) {
            if(name.equals("김준삼")) {
                findName = name;
                break;
            }
        }

        System.out.println(findName);

    }
}
