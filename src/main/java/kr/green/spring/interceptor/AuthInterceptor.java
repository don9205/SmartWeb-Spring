package kr.green.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter{
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
		if(user == null) {
			response.sendRedirect(request.getContextPath()+"/signup");
		}
		return true; // return false면 컨틀로러에 보내지도 않는다
	}
}
