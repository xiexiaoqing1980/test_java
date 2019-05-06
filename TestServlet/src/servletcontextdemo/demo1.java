package servletcontextdemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class demo1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext sContext=getServletContext();
//		System.out.println(sContext.getInitParameter("name"));
		
//		创建属性对象
		Properties properties=new Properties();
		//直接转换为流对象
		InputStream iStream=sContext.getResourceAsStream("/config.properties");
		properties.load(iStream);
		System.out.println(properties.getProperty("name"));
	
		
		String path=sContext.getRealPath("/config.properties");
		System.out.println(path);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	

}
