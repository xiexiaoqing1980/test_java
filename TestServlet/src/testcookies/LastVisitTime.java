package testcookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cookieutil.cookieutil;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Servlet implementation class LastVisitTime
 */
@WebServlet("/LastVisitTime")
public class LastVisitTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html;");
		if ("admin".equals(username)&&"12345".equals(password)) {
//			
			Cookie[] cookies = request.getCookies();
			Cookie cookie=cookieutil.findcookie(cookies, "lasttime");
			//第一次登录，添加cookie
			if (cookie==null) {
				Cookie lasttime=new Cookie("lasttime", System.currentTimeMillis()+"");
				lasttime.setMaxAge(60*60);
				response.addCookie(lasttime);
				writer.write("welcome");
				
			}else {
				//不是第一次
				
				long lasttime=Long.parseLong(cookie.getValue());
				writer.write("last visit time"+new Date(lasttime));
				
				cookie.setValue(System.currentTimeMillis()+"");
				response.addCookie(cookie); //更新值
			}
		
			//成功就跳转,重定向
//			resp.setStatus(302);
//			resp.setHeader("Location", "login_success.html");
//			resp.sendRedirect("login_success.html");

			
		} else {
//            System.out.println("fail");
			writer.write("fail");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
