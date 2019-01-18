package kr.green.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/bbs")//bbs로 들어오는 애들은 이쪽 컨틀로러를 사용한다
public class BoardController {
	@RequestMapping(value="/list")// /bbs/list로 사용하면 위에는 삭제해도 된다.
	public String list() {
		return "bbs/list";
	}
}
