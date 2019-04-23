package test.jdbc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class JdbcUtil {
	//代替配置
	private static String url;
	private static String driverClass;
	private static String user;
	private static String password;
	static{
		Properties prop=new Properties();
		InputStream inStream = null;
		try {
			inStream = new FileInputStream("jdbc.properties");
			//使用类加载器
//			inStream=JdbcUtil.class.getResourceAsStream("jdbc.properties");
			prop.load(inStream);
			inStream.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 driverClass=prop.getProperty("driverClass");
		 url=prop.getProperty("url");
		 user=prop.getProperty("user");
		password=prop.getProperty("password");
	}
	
	public static void main(String[] args) {
		System.out.println(url);
	}
	
	
	public static void closeAll(Connection con, Statement stmt, ResultSet rs) {
		//晚开早关
		try {
			if (rs!=null) {
				rs.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			rs=null; // 这样就算在关闭过程中抛异常不能及时关闭，但是由于赋值为空，没有引用该资源，在垃圾回收的时候也能够回收。
			
		}
		try {
			if (stmt!=null) {
				stmt.close();
			}
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}finally {
			stmt=null;
			
		}
		try {
			if (con!=null) {
				con.close();
			}
		}
		catch (Exception e3) {
			// TODO: handle exception
			e3.printStackTrace();
		} finally {
			// TODO: handle finally clause
			con=null;
		}
		
	}
	
	public static void close(Connection con, Statement stmt) {
		//晚开早关
		try {
			if (stmt!=null) {
				stmt.close();
			}
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}finally {
			stmt=null;
			
		}
		try {
			if (con!=null) {
				con.close();
			}
		}
		catch (Exception e3) {
			// TODO: handle exception
			e3.printStackTrace();
		} finally {
			// TODO: handle finally clause
			con=null;
		}
		
	}
    public static Connection getConnection() {
    	Connection con=null;
    	//			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection(url,user,password);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//建立连接
		return con;
	}
}
