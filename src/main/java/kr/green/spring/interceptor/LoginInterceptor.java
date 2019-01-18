package kr.green.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.green.spring.vo.AccountVo;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public void postHandle(
	    HttpServletRequest request, 
	    HttpServletResponse response, 
	    Object handler, 
	    ModelAndView modelAndView)
	    throws Exception {
	    ModelMap modelMap = modelAndView.getModelMap();
	    AccountVo user = (AccountVo)modelMap.get("user");
	    
	    // AccountVo user2 = (AccountVo)modelAndView.getModelMap().get("user");
	    // ModelMap modelMap과 AccountVo user를 하나로 구현한 코드
	    if(user != null) {
	        HttpSession session = request.getSession();
	        session.setAttribute("user", user);
	        // request.getSession().setAttribute("user", user);
	        // 위에 두 코드를 하나로 구현한 코드
	    }
	}

}
