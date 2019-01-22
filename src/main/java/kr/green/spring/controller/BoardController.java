package kr.green.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.spring.service.BoardService;
import kr.green.spring.vo.AccountVo;
import kr.green.spring.vo.BoardVo;


@Controller
@RequestMapping(value="/bbs")//bbs로 들어오는 애들은 이쪽 컨틀로러를 사용한다
public class BoardController {
	
	@Autowired	
	private BoardService boardService; // 멤버변수를 생성
	
	@RequestMapping(value="/list")// /bbs/list로 사용하면 위에는 삭제해도 된다.
	public String list(Model model) {
		List<BoardVo> boardList =  boardService.getBoards();
		model.addAttribute("list",boardList);
		/*
		 * for(BoardVo tmp : boardList) { System.out.println(tmp); }
		 * ㅅ
		 */
		return "bbs/list";
	}
	
	@RequestMapping(value="/register", method= RequestMethod.GET)
	public String registerGet(BoardVo board) {
		System.out.println(board);
		return "bbs/register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String resiterPost(BoardVo boardVo,Model model) {
		System.out.println(boardVo);
			boardService.write(boardVo);
			return "redirect:/";
	}
	
	
	@RequestMapping(value="/board", method = RequestMethod.GET)
	public String boardGet(Boolean fail, Model model) {
		model.addAttribute("fail", fail);
		return "bbs/board";
	}

	//int -> Integer, double -> Double, boolean -> Boolean
	@RequestMapping(value = "/boardup", method = RequestMethod.POST)
	public String boardPost(BoardVo boardVo,Model model) {
		if(boardService.boardup(boardVo))
			return "redirect:/";
		else {
			model.addAttribute("fail",true);
			return "redirect:/board";
		}
	}
}




