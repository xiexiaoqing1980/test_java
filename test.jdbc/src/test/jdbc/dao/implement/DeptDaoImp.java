package test.jdbc.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import main.entity.javabean.Bank;
import test.jdbc.dao.DeptDao;
import test.jdbc.util.JdbcUtil;

public class DeptDaoImp  implements DeptDao{

	@Override
	public void query() {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		
		try {
			
			conn=JdbcUtil.getConnection();
			statement=conn.createStatement();
			String sql="select * from dept";
			rSet=statement.executeQuery(sql);
			while (rSet.next()) {
				String dept_name=rSet.getString("dept_name");
				int id=rSet.getInt("dep_id");
				System.out.println(id+dept_name);
		 } 
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			JdbcUtil.closeAll(conn, statement, rSet);
		}
		
	}

	@Override
	public void insert(String name,String password) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement statement=null;
//		ResultSet rSet=null;
		try {
			conn=JdbcUtil.getConnection();
			String sql="INSERT INTO user(phone,password) VALUES(?,?)";
			statement=conn.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, password);
		
			
			int result=statement.executeUpdate();
			if (result>0) {
				System.out.println("≤Â»Î≥…π¶");
			}else {
				System.out.println("≤Â»Î ß∞‹");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, statement);
		}
		
	}
		

	@Override
	public void login(String name, String password) {
		Connection conn=null;
		Statement statement=null;
		ResultSet rSet=null;
		
		try {
			
			conn=JdbcUtil.getConnection();
			statement=conn.createStatement();
			String sql="SELECT * FROM user WHERE phone='"+name+"' AND  password='"+password+"'";
			rSet=statement.executeQuery(sql);
			if (rSet.next()) {
				System.out.println("µ«¬º≥…π¶");
			}else {
				System.out.println("µ«¬º ß∞‹");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			JdbcUtil.closeAll(conn, statement, rSet);
		}
		
	}

	@Override
	public void save(List<Bank> list) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement statement=null;
		int[] result = null;
//		ResultSet rSet=null;
		try {
			conn=JdbcUtil.getConnection();
			String sql="INSERT INTO test(Tname,Tpassword) VALUES (?,?)";
			statement=conn.prepareStatement(sql);
			
//			for(int i=0;i<list.size();i++){
//				TestTable table=list.get(i);
//			}
			
			for(Bank t1:list){
				statement.setString(1, t1.getFname());
				statement.setInt(2, t1.getFamount());
				statement.addBatch();
				result=statement.executeBatch();
				statement.clearBatch();
			}
			for (int a : result) {
				System.out.println(a);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, statement);
		}
		
	}
		
		
	

}
