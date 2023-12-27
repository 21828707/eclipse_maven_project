package com.baek.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baek.dao.MemberDAO;
import com.baek.vo.Member;
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public List<Member> getMembers() {
		// TODO Auto-generated method stub
		ArrayList<Member> memberList = memberDAO.getMembers();
		
		return memberList;
	}
	
	@Override
	public void addMember(Member member) {
		// TODO Auto-generated method stub
		memberDAO.insertMember(member);
	}

	@Override
	public void removeMember(int id) {
		// TODO Auto-generated method stub
		memberDAO.deleteMember(id);
	}
	
	@Override
	public Member getModifyMember(int id) {
		// TODO Auto-generated method stub
		Member member = memberDAO.selectUpdateMember(id);
		return member;
	}
	
	@Override
	public void modifyMember(Member member) {
		// TODO Auto-generated method stub
		memberDAO.updateMember(member);
	}
}
