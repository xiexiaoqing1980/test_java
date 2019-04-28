package test.jdbc.util;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class MyDataSource  implements DataSource{
	List<Connection> list=new ArrayList<>();
	 public MyDataSource() {
		// TODO Auto-generated constructor stub
		 for(int i=0;i<10;i++){
			 Connection conn=JdbcUtil.getConnection();
			 list.add(conn);
		 }
	}
	
	/*
	 * (non-Javadoc)
	 * @see javax.sql.CommonDataSource#getLogWriter()
	 */

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoginTimeout(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isWrapperFor(Class<?> arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub 
		if (list.isEmpty()) {
			for(int i=0;i<5;i++){
				 Connection conn=JdbcUtil.getConnection();
				 list.add(conn);
			 }
			
		}
		return list.remove(0);
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	//
	public void addBack(Connection con) {
		list.add(con);
		
	}

}
