package com.baek.member.service;

import java.util.List;

import com.baek.member.domain.Member;

public interface MemberService {
	void add(Member member);
	void remove(String  memberName);
	List<Member> list();
}
