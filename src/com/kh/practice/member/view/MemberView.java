package com.kh.practice.member.view;

import com.kh.practice.member.model.vo.Member;

import java.util.List;
import java.util.Scanner;

public class MemberView {
    //    ======= 회원관리 프로그램 =======
//      1. 회원정보 전체조회
//      2. 회원 아이디로 조회
//      3. 회원 이름으로 조회
//      4. 회원가입
//      5. 회원정보 변경
//      6. 회원탈퇴
//      0. 프로그램 종료
//      메뉴 선택 :
    Scanner sc = new Scanner(System.in);

    // 기본 출력 > Run
    public int mainMenu() {
        System.out.println("====== 회원관리 프로그램 ======");
        System.out.println("1. 회원정보 전체조회");
        System.out.println("2. 회원 아이디로 조회");
        System.out.println("3. 회원 이름으로 조회");
        System.out.println("4. 회원가입");
        System.out.println("5. 회원정보 변경");
        System.out.println("6. 회원탈퇴");
        System.out.println("0. 프로그램 종료");
        System.out.print("메뉴 선택 : ");
        int value = sc.nextInt();
        return value;
    }

    // 회원가입 컨트롤러로 리턴함
    public Member inputMember() {
        System.out.print("아이디 : ");
        String memberId = sc.next();
        System.out.print("비밀번호 : ");
        String memberPwd = sc.next();
        System.out.print("이름 : ");
        String memberName = sc.next();
        System.out.print("나이 : ");
        int memberAge = sc.nextInt();
        System.out.print("성별 : ");
        String memberGender = sc.next();
        System.out.print("이메일 : ");
        String memberEmail = sc.next();
        System.out.print("전화번호 : ");
        String memberPhone = sc.next();
        sc.nextLine();
        System.out.print("주소 : ");
        String memberAddress = sc.nextLine();
        System.out.print("취미 : ");
        String memberHobby = sc.next();
        Member member = new Member(); // member 객체 생성
        member.setMemberId(memberId);
        member.setMemberPwd(memberPwd);
        member.setMemberName(memberName);
        member.setMemberAge(memberAge);
        member.setMemberGender(memberGender);
        member.setMemberEmail(memberEmail);
        member.setMemberPhone(memberPhone);
        member.setMemberAddress(memberAddress);
        member.setMemberHobby(memberHobby);
        return member;                  // member 객체 반환
    }

    // con에서 온 List mList를 Member의 toString을 이용해 출력함
    public void showAllMember(List<Member> mList) {
        System.out.println("=== === === 회원정보 전체조회 === === ===");
        for(Member mOne : mList){
            System.out.println(mOne.toString());
        }
    }
}
