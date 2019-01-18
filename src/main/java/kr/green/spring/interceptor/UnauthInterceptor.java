package kr.green.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UnauthInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Object user = session.getAttribute("user");
		// Object user = request.getSession().getAttribute("user");
		// 위에 두 주을 하나의 코드로 구현하는 방법
		if(user != null) {
			response.sendRedirect(request.getContextPath()+"/bbs/list");
		}
		return true;
	}
}
