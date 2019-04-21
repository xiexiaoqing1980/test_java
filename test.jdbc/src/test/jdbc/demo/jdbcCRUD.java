package test.jdbc.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.junit.Test;

import com.mysql.jdbc.Driver;

import test.jdbc.util.JdbcUtil;

public class jdbcCRUD {
	private  String url="jdbc:mysql://localhost:3306/employee";
	private String user="root";
	private String password="123456";
	
	@Test
	public void testQuery(){
		Connection con=null;
		Statement st=null;
		ResultSet rSet=null;

		try {
////			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			Class.forName("com.mysql.jdbc.Driver");
//			//建立连接
//			 con=DriverManager.getConnection(url,user,password);
			con=JdbcUtil.getConnection();
			//创建statement ，跟数据库打交道的对象
			 st=con.createStatement();
			String sql="select * from dept";
			rSet=st.executeQuery(sql);
			while (rSet.next()) {
				String dept_name=rSet.getString("dept_name");
				int id=rSet.getInt("dep_id");
				System.out.println(id+dept_name);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//一定要释放资源,后打开的先关闭
			JdbcUtil.closeAll(con, st, rSet);
		}
		
	}
	
	@Test
	public void testInsert(){
		Connection con=null;
		Statement st=null;
		ResultSet rSet=null;
		
		try {
////			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			Class.forName("com.mysql.jdbc.Driver");
//			//建立连接
//			 con=DriverManager.getConnection(url,user,password);
			con=JdbcUtil.getConnection();
			//创建statement ，跟数据库打交道的对象
			 st=con.createStatement();
			String sql="INSERT INTO dept(dept_name,empolyeename) VALUES ('1','2')";
//			rSet=st.executeQuery(sql);
//			while (rSet.next()) {
//				String dept_name=rSet.getString("dept_name");
//				int id=rSet.getInt("dep_id");
//				System.out.println(id+dept_name);
//			}
			int result=st.executeUpdate(sql);
			System.out.println(result);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//一定要释放资源,后打开的先关闭
			JdbcUtil.closeAll(con, st, rSet);
		}
		
	}

}
