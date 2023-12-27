package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.GuestBookListService;
import vo.ListResult;

@Controller
public class ListController {
	@Autowired
	private GuestBookListService guestBookListService;
	
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(value="page", defaultValue = "1")
	int page) {
		ListResult listResult = guestBookListService.getMessage(page, 10);
		
		return new ModelAndView("list", "listResult", listResult);
	}
}
