package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class MemberMain {

    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
        String selectedMenu = null;

        while(true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴 선택 >> ");
            selectedMenu = scanner.nextLine();
            //1(등록) - 5(전체조회) - 4(이름조회) - 6(삭제) - 2,3(수정 - 제일 어려움) C R D U
            if("q".equalsIgnoreCase(selectedMenu)) {
                break;
                /*
                1. [회원 등록하기 ]
                    이름 >> 김준일
                    주소 >> 부산 동래구
                    <<등록이 완료되었습니다>>
                 */
            } else if("1".equals(selectedMenu)) {
                String name;
                String address;
                System.out.println("회원 등록하기");
                System.out.print("이름 >> ");
                name = scanner.nextLine();
                System.out.print("주소 >> ");
                address = scanner.nextLine();
                members.add(new Member(name, address));
                System.out.println("<<등록이 완료되었습니다>>");


            }
            /*
            [회원 이름 수정하기]
            수정할 회원의 이름을 입력하세요 >> 김준일
            이름 >> 김준이
            <<등록이 완료되었습니다>>

             */
            else if("2".equals(selectedMenu)) {

            }
            /*
            [회원 주소 수정하기]
            수정할 회원의 이름을 입력하세요 >> 김준이
            주소 >> 부산 동래구 사직동
            <<수정이 완료되었습니다>>
             */
            else if("3".equals(selectedMenu)) {

            }
            /*
            [회원 이름을 조회하기]
            조회할 회원의 이름을 입력하세요 >> 김준이
            Member 객체 toString();
            <<수정이 완료되었습니다>>
             */
            else if("4".equals(selectedMenu)) {

            }
            /*
            [회원 전체 조회하기]
            조회할 회원의 이름을 입력하세요 >> 김준이
            MemberList 전체 반복 toString();
            <<수정이 완료되었습니다>>
             */
            else if("5".equals(selectedMenu)) {

            }
            /*
            [회원 이름으로 삭제하기]
            삭제할 회원의 이름을 입력하세요 >> 김준이
            삭제된 Member 객체 toString();
            <<삭제가 완료되었습니다>>
             */
            else if("6".equals(selectedMenu)) {

            } else {
                System.out.println("다시 선택하세요");

            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }

}
