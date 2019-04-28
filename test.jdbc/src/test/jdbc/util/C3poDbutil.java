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
		//��ȡ����,����������Զ��ҵ�����������ļ����н���
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
			//�����
			try {
				if (rs!=null) {
					rs.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				rs=null; // ���������ڹرչ��������쳣���ܼ�ʱ�رգ��������ڸ�ֵΪ�գ�û�����ø���Դ�����������յ�ʱ��Ҳ�ܹ����ա�
				
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
			//�����
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
		
		//������dbutil
	    public static Connection getConnection() {
	    	    Connection con=null;
			  //��ȡ����,����������Զ��ҵ�����������ļ����н���
	
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
