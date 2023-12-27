package com.baek.service;

import java.util.List;

import com.baek.vo.Member;

public interface MemberService {

	List<Member> getMembers();

	void addMember(Member member);
	void removeMember(int id);
	Member getModifyMember(int id);
	public void modifyMember(Member member);
}
