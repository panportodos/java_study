package com.study.ch07.register;

public class ProductRepository {

    void saveProduct(Product product) { //String name, String code, long price) {
        ProductDB productDB = new ProductDB();
        productDB.insertProduct(product);
    }
}
