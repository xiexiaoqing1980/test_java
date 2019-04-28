package test.jdbc.transcation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import test.jdbc.util.JdbcUtil;

public class TestTranscation {
	
	@Test
	
	public void testTranscation() {
		Connection con=null;
		Statement st=null;
		int rSet;

		try {
////			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			Class.forName("com.mysql.jdbc.Driver");
//			//建立连接
//			 con=DriverManager.getConnection(url,user,password);
			con=JdbcUtil.getConnection();
			//创建statement ，跟数据库打交道的对象
			con.setAutoCommit(false);
			 st=con.createStatement();
			String sql="UPDATE bank SET Famount=Famount-100 WHERE Fid=1";
			rSet=st.executeUpdate(sql);
			
//			int a=1/0;
			
			String sql2="UPDATE bank SET Famount=Famount+100 WHERE Fid=2";
			st.executeUpdate(sql2);
			
			con.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//一定要释放资源,后打开的先关闭
			try {
				con.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			JdbcUtil.close(con, st);
		}
		
	}

}
