package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.GuestBookWriteService;
import vo.Message;


@Controller
public class writeController {
	@Autowired
	private GuestBookWriteService guestBookWriteService;
	
	@RequestMapping("/write")
	public String write(Message message) { // 스프링이 클라이언트에서 넘어오는 정보를 가지고 객체를 자동으로 만들어 준다.
		guestBookWriteService.write(message);
		return "redirect:/mybatis/list";
	}
	
}
