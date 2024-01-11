package com.study.ch16.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

    private static ArrayList<Member> members = new ArrayList<>(); //static이어야 static메소드들이 접근할 수 있다

    //중복되는 기능 메소드화

    public static String inputSearchName(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(label + " >> ");
        return scanner.nextLine();
    }

    public static Member findMemberByName(String name) {

        for(Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }








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
                System.out.print("메뉴 선택 >> ");
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
                *해당 이름의 회원이 존재하지 않습니다.
                <<등록이 완료되었습니다>>

                 */

                else if("2".equals(selectedMenu)) {


                    //답
                    String searchName = inputSearchName("수정할 회원의 이름을 입력하세요");
                    Member findMember = findMemberByName(searchName);
                    if(findMember == null) {
                        System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                        continue;
                    }
                    System.out.println("이름 >> ");
                    String updateName = scanner.nextLine();
                    findMember.setName(updateName);
                    System.out.println("수정이 완료되었습니다");


                }
                /*
                [회원 주소 수정하기]
                수정할 회원의 이름을 입력하세요 >> 김준이
                주소 >> 부산 동래구 사직동
                <<수정이 완료되었습니다>>
                 */
                else if("3".equals(selectedMenu)) {


                    //답
                    String searchName = inputSearchName("수정할 회원의 이름을 입력하세요");
                    Member findMember = findMemberByName(searchName);
                    if(findMember == null) {
                        System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                        continue;
                    }
                    System.out.println("주소 >> ");
                    String updateAddress = scanner.nextLine();
                    findMember.setAddress(updateAddress);
                    System.out.println("수정이 완료되었습니다");

                }
                /*
                [회원 이름을 조회하기]
                조회할 회원의 이름을 입력하세요 >> 김준이
                Member 객체 toString();
                <<수정이 완료되었습니다>>
                 */
                else if("4".equals(selectedMenu)) {

                    //답
                    String searchName = null;
                    searchName = inputSearchName("조회할 회원의 이름을 입력하세요 >>> ");

                    Member findMember = findMemberByName(searchName);
                    if(findMember == null) {
                        System.out.println("회원이 존재하지 않습니다");
                        continue; //밑에 있는 sout이 실행안되고 다시 while로 넘어간다
                    }

                    System.out.println(findMember);

                }



                /*
                [회원 전체 조회하기]
                조회할 회원의 이름을 입력하세요 >> 김준이
                MemberList 전체 반복 toString();
                <<수정이 완료되었습니다>>
                 */
                else if("5".equals(selectedMenu)) {
                    //답
                    for(Member member : members) {
                        System.out.println(member);
                    }

                    System.out.println(members.toString());
                }
                /*
                [회원 이름으로 삭제하기]
                삭제할 회원의 이름을 입력하세요 >> 김준이
                삭제된 Member 객체 toString();
                <<삭제가 완료되었습니다>>
                 */
                else if("6".equals(selectedMenu)) {


                    //답 - 4번과 유사. remove활용(두가지 방법)
                    String searchName = null;
                    Member findMember = null;
                    System.out.print("삭제할 회원의 이름을 입력하세요 >>> ");
                    searchName = scanner.nextLine();
                    for(Member member : members) {
                        if(member.getName().equals(searchName)) {
                            findMember = member;
                            break;
                        }
                        if(findMember == null) {
                            System.out.println("회원이 존재하지 않습니다");
                            continue; //밑에 있는 sout이 실행안되고 다시 while로 넘어간다
                        }
                    }
                    members.remove(findMember);
                    System.out.println(findMember);


            } else {
                System.out.println("다시 선택하세요");

            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }

}


