package com.study.ch14;

import java.util.Objects;

/*&
Object 클래스 - 모든 클래스는 Object를 상속받는다(생략돼있을 뿐)
 */
public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "toString 메소드 테스트";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, address);
//    }
}

