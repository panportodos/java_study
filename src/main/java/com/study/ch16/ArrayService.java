package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayService {
    private String[] strArray;

    public void add(String str) {
        String[] newArray = new String[strArray.length+1];
        for(int i = 0; i< strArray.length; i++) {
            newArray[i] = strArray[i];
        }
        strArray = newArray;
        strArray[strArray.length -1] = str;

    }
    public void remove(int index) {
        String[] newArray = new String[strArray.length-1];
        for(int i = 0; i< strArray.length; i++) {
            newArray[i] = strArray[i < index ? i : i + 1]; //값처리는 삼항연산자를 쓰는 것이 코드를 줄일 수있다
        }
        strArray = newArray;
    }

    public int indexOf(String str) {
        if(str == null) {
            return -1;
        }
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        String result = "Array[ ";

        for(int i =0; i <strArray.length; i++) {
            result += strArray[i];
            if(i < strArray.length -1) {
                result += ", ";
            }
        }
        result += " ]";
        return result;
    }
}
