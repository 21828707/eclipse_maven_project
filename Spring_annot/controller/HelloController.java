package controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HelloController {

	// @RequestMapping("/hello.do") //
	@GetMapping("/hello.do")
	protected ModelAndView hello(HttpSession session) throws Exception {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("hello");
//		mav.addObject("greeting", getGreeting());

		// 스프링은 기본 영역이 request가 된다. 포워딩 방식은 기본적으로 디스패치 방식.
		// 따라서 request 영역에 greeting이라는 이름의 속성이 공유됨.
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/test.jsp");
		session.setAttribute("greeting", getGreeting());

		return mav;
	}

	private String getGreeting() {
		String greeting = null;
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour >= 6 && hour <= 12) {
			greeting = "좋은 아침입니다.";
		} else if (hour >= 12 && hour <= 17) {
			greeting = "점심 시간 입니다.";
		} else if (hour >= 18 && hour <= 22) {
			greeting = "좋은 저녁입니다.";
		} else {
			greeting = "have a good sleep";
		}

		return greeting;
	}
}
