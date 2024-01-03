package com.study.ch03;


    // 함수의 경우의 수 : 매개변수 OX, return OX, 자료형 다른 경우
public class Function02 {
    // 매개변수x, 리턴x
    public static void fx01() {
        //void : 비어있는
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    //함수의 오버로딩 : 함수이름이 같더라도 할당된 매개변수가 다르면 다른 함수로 정의가 가능하다
    public static void fx02(int age, String name) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }
    public static void fx02(String name, int age){
            System.out.println("fx02 함수 실행");
            System.out.println("이름: " + name);
            System.out.println("나이: " + age);
            System.out.println();
        }
    public static int fx03() {
            System.out.println("fx03 함수 실행");
            return 100;
        }
    public static String fx04(String name, int age) {
        return name + ", " + age;
    }




    public static void main(String[] args) {
        fx01();
        fx02(32,"bs");
        fx02("범수",33);

        int num = fx03();
        System.out.println(fx03());

        String result = fx04("범수",32);
            System.out.println(result);

    }
}
