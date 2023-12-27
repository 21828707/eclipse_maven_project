package controller;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.view.InternalResourceView;

public class HelloController extends AbstractController {
	
	//요청이 들어오면 handleRequestInternal 메소드가 자동으로 호출됨
@Override
protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	// TODO Auto-generated method stub
	
	ModelAndView mav = new ModelAndView();
	mav.setViewName("hello");
	mav.addObject("greeting", getGreeting());
	//스프링은 기본영역이 request로 인식됨
	//따라서 , request 영역에 greeting 이라는 이름의 속성이 공유됨
	return mav;
}

	private Object getGreeting() {
		// TODO Auto-generated method stub
		String greeting = null;
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 6 && hour <= 12) {
			greeting = "좋은 아침입니다.";
		}
		else if(hour >= 12 && hour <= 17) {
			greeting = "점심 식사는 하셨나요?";
		}
		else if(hour >= 18 && hour <= 22) {
			greeting = "좋은 저녁되세요.";
		}
		
		return greeting;
	}
}
