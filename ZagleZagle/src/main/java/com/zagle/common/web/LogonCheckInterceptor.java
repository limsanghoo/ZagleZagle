package com.zagle.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.zagle.service.domain.User;




public class LogonCheckInterceptor extends HandlerInterceptorAdapter {

	
	public LogonCheckInterceptor(){
		System.out.println("\nCommon :: "+this.getClass()+"\n");		
	}
	
	public boolean preHandle(	HttpServletRequest request,
														HttpServletResponse response, 
														Object handler) throws Exception {
		
		System.out.println("\n[ LogonCheckInterceptor start........]");
		
	
		HttpSession session = request.getSession(true);
		User user = (User)session.getAttribute("user");

	
		if(   user != null   )  {
		
			String uri = request.getRequestURI();
			
			if(		uri.indexOf("addUser") != -1 ||	uri.indexOf("login") != -1 		|| 
					uri.indexOf("checkDuplication") != -1 ){
				request.getRequestDispatcher("/index.jsp").forward(request, response);
				System.out.println("[ 占싸깍옙占쏙옙 占쏙옙占쏙옙.. 占싸깍옙占쏙옙 占쏙옙 占쏙옙占십울옙 占쏙옙 占썰구.... ]");
				System.out.println("[ LogonCheckInterceptor end........]\n");
				return false;
			}
			
			System.out.println("[ 占싸깍옙占쏙옙 占쏙옙占쏙옙 ... ]");
			System.out.println("[ LogonCheckInterceptor end........]\n");
			return true;
		}else{ 
			
			String uri = request.getRequestURI();
			
			if(		uri.indexOf("addUser") != -1 ||	uri.indexOf("login") != -1 		|| 
					uri.indexOf("checkDuplication") != -1 ){
				System.out.println("[ 占싸깍옙 占시듸옙 占쏙옙占쏙옙 .... ]");
				System.out.println("[ LogonCheckInterceptor end........]\n");
				return true;
			}
			
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			System.out.println("[ 占싸깍옙占쏙옙 占쏙옙占쏙옙 ... ]");
			System.out.println("[ LogonCheckInterceptor end........]\n");
			return false;
		}
	}
}