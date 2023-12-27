package com.baek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.baek.service.MemberService;
import com.baek.vo.Member;

@Controller
public class MainContoller {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/main")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		
		List<Member> memberList = memberService.getMembers();
		
		mav.addObject("memberList", memberList);
		mav.setViewName("main");
		
		return mav;
	}
	
	@PostMapping("/insert")
	public String addMember(Member member) {

		memberService.addMember(member);
		return "redirect:/main";
	}

	@RequestMapping("/delete")
	public String deleteMember(@RequestParam("id") int id) {

		memberService.removeMember(id);
		return "redirect:/main";
	}

	@RequestMapping("/updateForm")
	public ModelAndView modifyForm(@RequestParam("id") int id) {
		ModelAndView mav = new ModelAndView();
		Member member = memberService.getModifyMember(id);
		mav.addObject("member", member);
		mav.setViewName("updateForm");
		return mav;
	}

	@PostMapping("/update")
	public String modifyMember(Member member) {
		memberService.modifyMember(member);
		return "redirect:/main";
	}

}
