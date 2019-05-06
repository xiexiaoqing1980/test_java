package servletcontextdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//req获取数据
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		PrintWriter writer = resp.getWriter();
		if ("admin".equals(username)&&"12345".equals(password)) {
//			System.out.println("success");
//			writer.write("success");
			Object att = getServletContext().getAttribute("count");
			int total=0;
			if (att!=null) {
				total=(int) att;
			}
			getServletContext().setAttribute("count", total+1);
			System.out.println("次数为"+total);
		
			//成功就跳转,重定向
//			resp.setStatus(302);
//			resp.setHeader("Location", "login_success.html");
//			resp.sendRedirect("login_success.html");
			
			req.getRequestDispatcher("login_success.html").forward(req, resp);
			
			
		} else {
//            System.out.println("fail");
			writer.write("fail");
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	

}
