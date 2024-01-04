package com.study.ch07.register;

public class ProductService {

//기능은 동사로, 변수는 명사로, 리턴이 불리형이면 is로 쓴다
    boolean isEmptyString(String str) {
        if(str == null) {
            return true;
        }
        return str.isBlank(); //null이 아니면 주소참조가 가능하다 //isBlank는 비었는지 묻는 메소드. 비어있으면 true가 나오게 설정

    }
    void registerProductService(Product product) { //String name, String code, long price) {
        ProductRepository productRepository = new ProductRepository();
        System.out.println("서비스까지 데이터 전달 완료");

        productRepository.saveProduct(product);//name, code, price);

    }
}
