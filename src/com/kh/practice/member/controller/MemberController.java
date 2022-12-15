package com.kh.practice.member.controller;

import com.kh.practice.member.model.vo.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberController {
    // 객체 배열생성
    List<Member> mList;
    Scanner sc = new Scanner(System.in);

    // Member형 List : mList 객체 생성
    public MemberController() {
        mList = new ArrayList<Member>();
    }

    // mList에 객체를 참조함
    public void registerMember(Member member) {
        mList.add(member);
    }

    //registerMember에서 저장된 mList<member>를 호출위치로 리턴
    public List<Member> printAllMember() {
        return mList;
    }

    // 입력받은 id와 같은값의 아이디가 있는경우 해당 인덱스를 리턴
    public int findMemberId(String memberId) {
        for (int i = 0; i < mList.size(); i++) {
            //memberId 와 mList의 memberId가 같은값이 있는지 찾기
            Member mOne = mList.get(i);
            // mList에서 받은 mOne에 있는지 확인
            if (memberId.equals(mOne.getMemberId())) {
                return i;       // 찾은 List의 순서를 리턴함
            }
        }
        return -1;          // 못찾은 경우 -1 리턴
    }

    // findMemberID에서 찾은 인덱스값을 이용하여 데이터 를 찾음
    public Member printOneByIndex(int index) {
        Member member = mList.get(index);
        return member;
    }

    public int findMemberName(String memberName) {
        for (int i = 0; i < mList.size(); i++) {
            Member mTwo = mList.get(i);
            if (memberName.equals(mTwo.getMemberName())) {
                return i;
            }
        }
        return -1;
    }

    public Member printTwoByIndex(int index) {
        Member member = mList.get(index);
        return member;
    }

    public int findUpdateNo(String updateId) {
        for (int i = 0; i < mList.size(); i++) {
            Member mFor = mList.get(i);
            if (updateId.equals(mFor.getMemberId())) {
                return i;
            }
        }
        return -1;
    }

//    public Member updateInfo(int index){
//        Member member = mList.get(index);
//        return member;
//    }

    public void upDateInformation(int index, int choice, String data) {
        Member member = mList.get(index);
        switch (choice) {
            case 1:
                member.setMemberPwd(data);
                break;
            case 2:
                member.setMemberName(data);
                break;
            case 3:
                member.setMemberAge(Integer.parseInt(data));
                break;
            case 4:
                member.setMemberGender(data);
                break;
            case 5:
                member.setMemberEmail(data);
                break;
            case 6:
                member.setMemberPhone(data);
                break;
            case 7:
                member.setMemberAddress(data);
                break;
            case 8:
                member.setMemberHobby(data);
                break;
        }
    }

    public int deleteIdNo(String deleteId) {
        for (int i = 0; i < mList.size(); i++) {
            Member mDel = mList.get(i);
            if (deleteId.equals(mDel.getMemberId())) {
                return i;
            }
        }
        return -1;
    }
    public void deleteId(int deleteIdNo){
        mList.remove(deleteIdNo);
    }

}
