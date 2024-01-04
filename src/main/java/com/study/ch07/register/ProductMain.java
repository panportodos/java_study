package com.study.ch07.register;

import java.util.Scanner;
//Main -> Service -> Repository -> DB
public class ProductMain {
    public static void main(String[] args) {
        ProductService productService = new ProductService(); //생성자를 생성해야지 그 클래스 안 메소드(기능)를 쓸 수 있다
        //alt+shift+화살표 하면 줄이동
        Scanner scanner = new Scanner(System.in);
        String productName = null;
        String productCode = null;
        long productPrice = 0;

        System.out.println("상품 등록 프로그램");

        System.out.print("상품명>>> ");
        productName = scanner.nextLine();
        if(productService.isEmptyString(productName)){
            System.out.println("상품명을 다시 입력하세요.");
            return;
        }
        System.out.print("상품코드번호(ex.P20240000)>>> ");
        productCode = scanner.nextLine();
        if(productService.isEmptyString(productName)){
            System.out.println("상품코드번호를 다시 입력하세요.");
            return; //클래스가 void면 return을 주면 종료가 된다
        }
        System.out.print("상품가격>>> ");
        productPrice = scanner.nextLong();

        Product product = new Product(productName, productCode, productPrice);

        productService.registerProductService(product);//productName,productCode,productPrice);
    }
}
