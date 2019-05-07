package testcookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookies
 */
@WebServlet("/cookies")
public class cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//��ȡ�ͻ��˴�������cookies,��һ�η��ʵ�ʱ�����Ϊ��
		Cookie[] cookies=request.getCookies();
		if (cookies!=null) {
					for (Cookie cookie : cookies) {
						System.out.println(cookie.getName()+":"+cookie.getValue());
					}
				}
		
		
		
		//����Ӧ���cookis
		//Set-Cookie: name=xinna,����cookie��������˱���
		response.addCookie(new Cookie("name", "xinna"));
		response.addCookie(new Cookie("name", "18"));
		response.getWriter().write("get cookies");
		
		

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
