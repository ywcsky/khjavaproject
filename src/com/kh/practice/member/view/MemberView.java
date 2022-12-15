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
        return member;                  // 데이터를 member객체에 담아 반환
    }

    public String inputMemberId(){
        System.out.print("검색할 아이디 입력 : ");
        String memberId = sc.next();
        return memberId;
    }

    // controller에서 온 List mList를 Member의 toString을 이용해 출력함
    public void showAllMember(List<Member> mList) {
        System.out.println("=== === === 회원정보 전체조회 === === ===");
        for(Member mOne : mList){                   //Member mOne 이라는 객체에 mList를 참조하게 만드는 for each
            System.out.println("아이디 : " + mOne.getMemberId());// mList를 참조하는 mOne객체의 get 메소드를 실행
            System.out.println("비밀번호 : " + mOne.getMemberPwd());
            System.out.println("이름 : " + mOne.getMemberName());
            System.out.println("나이 : " + mOne.getMemberAge());
            System.out.println("성별 : " + mOne.getMemberGender());
            System.out.println("이메일 : " + mOne.getMemberEmail());
            System.out.println("휴대폰 번호 : " + mOne.getMemberPwd());
            System.out.println("주소 : " + mOne.getMemberAddress());
            System.out.println("취미 : " + mOne.getMemberHobby());
            System.out.println("==================================");

        }
    }

    // Controller에서 받아온 member를 이용하여 해당 member객체의 정보를 출력
    public void printOneById(Member mOne){
        System.out.println(mOne.toString());
    }

    public String inputmemberName(){
        System.out.print("검색할 이름 입력 : ");
        String memberName = sc.next();
        return memberName;
    }

    public String updateMember(){
        System.out.println("수정할 정보의 아이디 입력 : ");
        String updateId = sc.next();
        return updateId;
    }

    public int updateInfom(){
        System.out.println("업데이트할 정보 선택");
        System.out.println("1. 비밀번호");
        System.out.println("2. 이름");
        System.out.println("3. 나이");
        System.out.println("4. 성별");
        System.out.println("5. 이메일");
        System.out.println("6. 휴대폰 번호");
        System.out.println("7. 주소");
        System.out.println("8. 취미");
        System.out.print("입력 : ");
        int choice = sc.nextInt();
        return choice;
    }

    public String updateInfomtion(Member member,int index){
        System.out.println("변경할 정보 입력 : ");
        String updateData = sc.nextLine();
        return updateData;
    }

}
