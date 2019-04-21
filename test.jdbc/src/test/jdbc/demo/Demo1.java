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

public class Demo1 {
	private  String url="jdbc:mysql://localhost:3306/employee";
	private String user="root";
	private String password="123456";
	
	@ Test
	public void test1() throws SQLException{
		
		//�����������������
		Driver driver=new com.mysql.jdbc.Driver();
		Properties properties=new Properties();
		properties.setProperty("user", user);
		properties.setProperty("password", password);
		
		//�������ݿ⣬���ض���
		Connection conn= driver.connect(url, properties);
		System.out.println(conn);
	}
	
	@Test
	public void test2(){
		Connection con=null;
		Statement st=null;
		ResultSet rSet=null;
		//ע������
		try {
			//ע������,��̬��������������new com.mysql.jdbc.Driver()
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//��������
			 con=DriverManager.getConnection(url,user,password);
			
			//����statement �������ݿ�򽻵��Ķ���
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
			//һ��Ҫ�ͷ���Դ,��򿪵��ȹر�
			JdbcUtil.closeAll(con, st, rSet);
		}
		
	}
	
	@Test
	public void test3(){
		Connection con=null;
		Statement st=null;
		ResultSet rSet=null;
		
		try {
////			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			Class.forName("com.mysql.jdbc.Driver");
//			//��������
//			 con=DriverManager.getConnection(url,user,password);
			con=JdbcUtil.getConnection();
			//����statement �������ݿ�򽻵��Ķ���
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
			//һ��Ҫ�ͷ���Դ,��򿪵��ȹر�
			JdbcUtil.closeAll(con, st, rSet);
		}
		
	}

}
