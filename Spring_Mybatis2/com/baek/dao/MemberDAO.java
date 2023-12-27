package com.baek.dao;

import java.util.ArrayList;

import com.baek.vo.Member;

public interface MemberDAO {
	public ArrayList<Member> getMembers();
	
	public void insertMember(Member member);
	public void updateMember(Member member);
	public void deleteMember(int id);
	public Member selectUpdateMember(int id);
}
