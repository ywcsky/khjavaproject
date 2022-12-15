package com.kh.practice.member.controller;

import com.kh.practice.member.model.vo.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberController {
    // 객체 배열생성
    List<Member> mList;

    // 객체
    public MemberController(){
        mList = new ArrayList<Member>();
    }

    // 리스트에 객체를 추가함
    public void registerMember(Member member){
        mList.add(member);
    }

    //전체 Member List를 view 로 건네줌
    public List<Member> printAllMember(){
       return mList;
    }
}
