package kr.lee.exhome;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.lee.exhome.service.AccountService;
import kr.lee.exhome.vo.AccountVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	AccountService accountService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, Boolean signup) {
		model.addAttribute("signup", signup);
		return "home";
	}
	@RequestMapping(value = "/signup", method=RequestMethod.GET)
	public String sighupGet(Model model, Boolean signup) {
		model.addAttribute("signup", signup);
		return "signup";
	}
	@RequestMapping(value = "/signup", method=RequestMethod.POST)
	public String sighupPost(AccountVo accountVo, Model model) {
		System.out.println(accountVo);
		if(accountService.signup(accountVo)) {
			System.out.println("회원가입 성공");
			model.addAttribute("signup",true);
			return "redirect:/";
		}else {
			System.out.println("회원가입 실패");
		}
			model.addAttribute("signup",false);
		  return "redirect:/signup";
	}
	
}
