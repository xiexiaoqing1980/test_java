package test.jdbc.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3poDbutil {
	
	@Test
	public void testC3p0(){
		Connection con=null;
		PreparedStatement pStatement=null;
		//获取连接,类加载器会自动找到下面的配置文件进行解析
		try {
			ComboPooledDataSource dataSource=new ComboPooledDataSource();
			con=dataSource.getConnection();
			String sql="UPDATE bank SET Famount=Famount-100 WHERE Fid=?";
			pStatement=con.prepareStatement(sql);
			pStatement.setInt(1, 1);
	
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.close(con, pStatement);
			
		}
		
		
		
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
		
		//改造后的dbutil
	    public static Connection getConnection() {
	    	    Connection con=null;
			  //获取连接,类加载器会自动找到下面的配置文件进行解析
	
				ComboPooledDataSource dataSource=new ComboPooledDataSource();
				try {
					con=dataSource.getConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return con;
			
	    }
	

}
