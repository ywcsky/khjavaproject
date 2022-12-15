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
                case 1 :
                    List<Member> mList = mCon.printAllMember();
                    view.showAllMember(mList);
                    break;
                case 2 : break;
                case 3 : break;
                case 4 :
                    Member member = view.inputMember();     // member객체에 inputMember
                    mCon.registerMember(member);
                    break;
                case 5 : break;
                case 6 : break;
                case 0 : break end;
            }
        }
    }
}
