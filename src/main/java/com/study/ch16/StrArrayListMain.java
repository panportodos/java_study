package com.study.ch16;

import java.util.ArrayList;

public class StrArrayListMain { //ArrayList를 쓰면 일일이 add, get, 등을 안만들어도 된다
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");

        System.out.println(strList);
        System.out.println(strList.get(1));
        System.out.println(strList.indexOf("c"));
        strList.remove(1);
        System.out.println(strList);
    }

}
