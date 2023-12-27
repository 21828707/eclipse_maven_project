package com.baek.mybatis;

import java.util.ArrayList;

import com.baek.vo.Member;

// dao클래스에서 mapper인터페이스에 있는 메소드를 호출하면
// 자동으로 해당 메소드와 동일한 아이디를 가진 mapper xml파일의 statement가 호출된다.
// mapper인터페이스에 정의되는 메소드 이름과 mapper xml파일의 statement 아이디가 같아야 한다.
public interface MemberMapper {
	ArrayList<Member> getMembers();
	
	void insertMember(Member member);
	
	void updateMember(Member member);
	
	void deleteMember(int id);
	
	Member getUpdateMember(int id);
}
