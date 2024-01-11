/*
package com.study.ch08.Book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true;
        Book[] books = new Book[3];
        BookRepository BR = new BookRepository(books);
        BookService BS = new BookService(BR);

        while (loopFlag) {
            System.out.println("도서 관리 프로그램");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();
            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램을 종료합니다.");
                loopFlag = false;
            } else if ("1".equalsIgnoreCase(selectedMenu)) {
                System.out.println("<<<도서 등록 페이지>>>");
                String name = null;
                String author = null;
                System.out.print("도서명: ");
                name = scanner.nextLine();
                System.out.print("저자: ");
                author = scanner.nextLine();

                Book book = new Book(name, author);
                BS.append(book);
//                System.out.println(book.toString());
//                for (int i = 0; i < books.length; i++) {
//                    if (books[i] == null) {
//                        books[i] = book;
//                        break;
//                    }
                }
             else if ("2".equalsIgnoreCase(selectedMenu)) {
                System.out.println("<<<도서 조회 페이지>>>");
                BS.show();

            } else {
                System.out.println("다시 입력하세요.");
            }
        }
    }
}



*/



