package com.baek.member.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baek.member.domain.Member;
import com.baek.member.service.MemberService;

@Controller
@RequestMapping("/member/*") // member밑으로 넘어오는 요청 처리
public class MemberContoller {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping
	public String listMemberBasic(Model model) {
		model.addAttribute("guests", memberService.list());
		
		return "memberList"; // 뷰는 memberList
	}

	@RequestMapping("/list")
	public String listMember(Model model) {
		model.addAttribute("guests", memberService.list());
		
		return "memberList"; // 뷰는 memberList
	}

	@RequestMapping("/add")
	public String addMember(Member member, Model model) {
		memberService.add(member);
		model.addAttribute("guests", memberService.list());
		
		return "memberList"; // 뷰는 memberList
	}

	@GetMapping(value={"/remove", "/delete/"})
	public String removeMember(@RequestParam("memberName") String memberName) {
		memberService.remove(memberName);
		
		return "redirect:/member/list";
	}
}
