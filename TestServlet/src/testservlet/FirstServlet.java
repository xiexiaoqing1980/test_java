package testservlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		ServletConfig sConfig=getServletConfig();
//		String name=sConfig.getServletName();
//		System.out.println(name);
		
//		String address=sConfig.getInitParameter("address");
//		System.out.println(address);
		
		Enumeration<String> names=sConfig.getInitParameterNames();
		while (names.hasMoreElements()) {
			String string = (String) names.nextElement();
			System.out.println(string);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
	}

//	@Override
//	public void init() throws ServletException {
//		// TODO Auto-generated method stub
//		System.out.println("≥ı ºªØ.....");
//	}

	
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
////		super.service(req, res);
//		System.out.println("call the service");
//		
//	}
//
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
////		super.destroy();
//		System.out.println("destroy the servlet");
//	}
//	
	
	
	
	
	

	
	
	
	

}
