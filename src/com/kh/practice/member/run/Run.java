package com.kh.practice.member.run;

import com.kh.practice.member.controller.MemberController;
import com.kh.practice.member.model.vo.Member;
import com.kh.practice.member.view.MemberView;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        MemberView view = new MemberView();
        MemberController mCon = new MemberController();
        end :
        while (true) {
            int choice = view.mainMenu();
            switch (choice){
                case 1 :     // 전체 조회
                    List<Member> mList = mCon.printAllMember(); // Controller에서 생성된 mList를 mList에 담음
                    view.showAllMember(mList);                  // mList를 view의 출력메소드인 showAllMember의 매개변수로 사용됨
                    break;
                case 2 :    // 아이디 출력
                    String memberId = view.inputMemberId();
                    int index = mCon.findMemberId(memberId);
                    if(index == -1){
                        System.out.println("해당 아이디가 없습니다.");
                        break;
                    }
                    Member mOne = mCon.printOneByIndex(index);
                    view.printOneById(mOne);
                    break;
                case 3 :
                    String memberName = view.inputmemberName();
                    int nameIndex = mCon.findMemberName(memberName);
                    if(nameIndex == -1){ System.out.println("없는 이름입니다."); break ;}
                    Member mTow = mCon.printTwoByIndex(nameIndex);
                    view.printOneById(mTow);
                    break;
                case 4 :
                    Member member = view.inputMember();     // inputMember에서 생성된 member를 member객체에 담음
                    mCon.registerMember(member);            // ㄴ member객체를 mList(member)에 저장
                    break;
                case 5 :
                    String updateId = view.updateMember();
                    int updateNo = mCon.findUpdateNo(updateId);
                    if(updateNo == -1) {
                        System.out.println("없는 아이디 입니다.");
                        break;
                    }
                    int updateChoice = view.upDateInform();
                    String upDateData = view.upDateData();
                    mCon.upDateInformation(updateNo,updateChoice,upDateData);
                    break;
                case 6 :
                    String deleteId = view.deleteId();
                    int deleteIdNo = mCon.deleteIdNo(deleteId);
                    if(deleteIdNo == 1){
                        System.out.println("없는 아이디 입니다.");
                        break;
                    }
                    mCon.deleteId(deleteIdNo);
                    break;
                case 0 : break end;
            }
        }
    }
}
