package com.study.ch07;

public class User01 {
    // 속성
    // username(아이디) - 필수
    // password(비밀번호) - 필수
    // name
    // email

    // 메소드
    // setName() - 메소드의 매개변수를 통해 name의 값을 변경
    // setEmail() - 메소드의 매개변수를 통해 email의 값을 변경
    // showInfo() - 모든 속성 값 출력

    String username;
    String password;
    String name;
    String email;


    User01(String username, String password) {

        this.username = username;
        this.password = password;

    }
    User01(String username, String password, String name, String email) {

        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;

    }
    void setName(String name) {
        this.name = name;
    }
    void setEmail(String email) {
        this.email = email;
    }

    void showInfo() { //클래스 안에 정의된 함수 : 메소드, 자바는 모두 클래스이므로 자바에서의 모든 함수는 메소드
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("name: " + name);
        System.out.println("email: " + email);
    }
}






