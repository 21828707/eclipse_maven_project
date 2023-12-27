package controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class CookieController {
	@GetMapping("/cookie/make.do")
	public String make(HttpServletResponse response) {
		// 스프링도 서블릿 기반으로 돌라간다.
		response.addCookie(new Cookie("auth", "1"));
		
		return "cookie/made";
	}
	
	@GetMapping("/cookie/view.do")
	public String view(@CookieValue(value="auth", defaultValue = "0") String auth) {
		System.out.println("auth 쿠키 = " + auth);
		
		return "cookie/view";
	}
	
	@GetMapping("/headerView.do")
	public String viewHeader(@RequestHeader("User-Agent") String browserInfo) {
		System.out.println("User-Agent = " + browserInfo);
		
		return "cookie/header";
	}
}
