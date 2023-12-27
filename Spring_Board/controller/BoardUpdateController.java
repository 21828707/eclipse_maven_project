package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.BoardUpdateService;
import vo.Board;

@Controller
public class BoardUpdateController {
	@Autowired
	private BoardUpdateService boardUpdateService;
	
	@RequestMapping("/board_update_action.do")
	public String updateBoard(Board board) {
		boardUpdateService.modifyBoard(board);
		
		return "redirect:/board_list.do";
	}
}
