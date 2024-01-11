//package com.study.ch08.Book;
//
//
//public class BookRepository {
//    final Book[] books;
//
//    BookRepository(Book[] books) {
//        this.books = books;
//    }
//    int getEmptyIndex() {
//            for(int i = 0; i < books.length; i++) {
//                if(books[i] == null) {
//                    return i;
//                }
//            }
//            return -1;
//        }
//    void insert(Book[] book) {
//        book[getEmptyIndex()] = book;
//    }
//
//    Book[] getData() {
//        return books;
//    }
//}
