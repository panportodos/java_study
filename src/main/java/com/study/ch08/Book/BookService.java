//package com.study.ch08.Book;
//
//import com.study.ch08.Car;
//
//public class BookService {
//
//BookRepository BR;
//BookService(BookRepository BR) {
//    this.BR = BR;
//}
//    void append(Book book) {
//    BR.insert(book);
//    }
//
//    void show() {
//        Book[] books = BR.getData();
//        for (int i = 0; i < books.length; i++) {
//            if (books[i] == null) {
//                System.out.println("");
//                continue;
//            }
//            System.out.println(books[i].toString());
//        }
//    }
//
//}
