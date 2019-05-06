package downloadfiletest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.misc.BASE64Encoder;

/**
 * Servlet implementation class DownLoadFile
 */
@WebServlet("/DownLoadFile")
public class DownLoadFile extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String filename=request.getParameter("filename");
		
		String userAgent=request.getHeader("User-Agent");
		
		InputStream iStream=getServletContext().getResourceAsStream("/download/"+filename);
		
//		filename=new String(filename.getBytes("ISO8859-1"),"UTF-8"); //对文件名称进行重新编码,加上这段代码会乱码
		/*
		 * 对不同的浏览器用不同的编码
		 */
		System.out.println(filename);
		
		if (userAgent.contains("Firefox")) {
			filename=base64EncodeFileName(filename);
		}else {
			filename=URLEncoder.encode(filename,"UTF-8");
			System.out.println(filename);
		}
		
		//写出的时候，以下载的方式提示用户，而不是直接展示
		response.setHeader("Content-Disposition", "attachment;filename="+filename); 
//		String path=getServletContext().getRealPath("/download/"+filename);
//		System.out.println(path);
//		InputStream iStream=new FileInputStream(path);  //字节输入流
		OutputStream oStream=response.getOutputStream();  //字节输出流
		
		int len=0;
		byte[] buffer=new byte[1024];
		while ((len=iStream.read())!=-1) {
			oStream.write(buffer, 0, len);  //
		}
		iStream.close();
		oStream.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public  String base64EncodeFileName(String fileName) {
		BASE64Encoder base64Encoder = new BASE64Encoder();
		try {
			return "=?UTF-8?B?"
					+ new String(base64Encoder.encode(fileName
							.getBytes("UTF-8"))) + "?=";
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
