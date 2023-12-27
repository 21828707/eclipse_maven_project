package com.baek.member.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import com.baek.member.domain.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	private Map<String , Member> members = new TreeMap<String, Member>();
	
	@Override
	public void add(Member member) {
		// TODO Auto-generated method stub
		members.put(member.getName(), member);
	}

	@Override
	public void remove(String memberName) {
		// TODO Auto-generated method stub
		members.remove(memberName);
	}

	@Override
	public List<Member> list() {
		// TODO Auto-generated method stub
		return new ArrayList<Member>(members.values());
	}
}
