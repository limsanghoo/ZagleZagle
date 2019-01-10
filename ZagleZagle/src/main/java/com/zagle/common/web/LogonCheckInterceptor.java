package com.zagle.common.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.zagle.service.domain.User;



/*
 * FileName : LogonCheckInterceptor.java
 *  占쏙옙 Controller 호占쏙옙占쏙옙 interceptor 占쏙옙 占쏙옙占쏙옙 占쏙옙처占쏙옙/占쏙옙처占쏙옙/占싹뤄옙처占쏙옙占쏙옙 占쏙옙占쏙옙
 *  	- preHandle() : Controller 호占쏙옙占쏙옙 占쏙옙처占쏙옙   
 * 			(true return ==> Controller 호占쏙옙 / false return ==> Controller 占쏙옙호占쏙옙 ) 
 *  	- postHandle() : Controller 호占쏙옙 占쏙옙 占쏙옙처占쏙옙
 *    	- afterCompletion() : view 占쏙옙占쏙옙占쏙옙 처占쏙옙
 *    
 *    ==> 占싸깍옙占쏙옙占쏙옙 회占쏙옙占싱몌옙 Controller 호占쏙옙 : true return
 *    ==> 占쏙옙 占싸깍옙占쏙옙占쏙옙 회占쏙옙占싱몌옙 Controller 占쏙옙 호占쏙옙 : false return
 */
public class LogonCheckInterceptor extends HandlerInterceptorAdapter {

	///Field
	
	///Constructor
	public LogonCheckInterceptor(){
		System.out.println("\nCommon :: "+this.getClass()+"\n");		
	}
	
	///Method
	public boolean preHandle(	HttpServletRequest request,
														HttpServletResponse response, 
														Object handler) throws Exception {
		
		System.out.println("\n[ LogonCheckInterceptor start........]");
		
	
		HttpSession session = request.getSession(true);
		User user = (User)session.getAttribute("user");

	
		if(   user != null   )  {
			//==> 占싸깍옙占쏙옙 占쏙옙占승울옙占쏙옙 占쏙옙占쏙옙 占쌀곤옙 URI
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
		}else{ //==> 占쏙옙 占싸깍옙占쏙옙占쏙옙 화占쏙옙占싱띰옙占�...
			//==> 占싸깍옙占쏙옙 占시듸옙 占쏙옙.....
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
}//end of class