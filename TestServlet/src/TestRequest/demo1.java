package TestRequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class demo1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		System.out.println("username:"+username);
		Enumeration<String> headerNames = req.getHeaderNames();
//		while (headerNames.hasMoreElements()) {
//			String name = (String) headerNames.nextElement();
//			System.out.println(name+":"+req.getHeader(name));
//		}
//		PrintWriter writer = resp.getWriter();
		//д��ȥ��Ĭ�ϵı���Ϊ��ios-8��,�Լ��趨����ĸ�ʽ
//		resp.setCharacterEncoding("UTF-8");
//		resp.setHeader("Content-Type", "text/html;charset=UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		resp.getOutputStream().write("������".getBytes("utf-8"));
//		writer.write("�Ӷ�");
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
	}
	

}
