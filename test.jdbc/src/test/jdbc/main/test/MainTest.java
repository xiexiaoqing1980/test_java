package test.jdbc.main.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.entity.javabean.Bank;
import test.jdbc.dao.DeptDao;
import test.jdbc.dao.implement.DeptDaoImp;

public class MainTest {
//	public static void main(String[] args) {
		
	DeptDao deptDao=new DeptDaoImp();
//	deptDao.query();
//	deptDao.login("001", "123' or'1=1");    sqlע��
//	deptDao.login("008' OR '2=2'--", "123"); 
//	deptDao.insert("002", "002");
	
	@Test
	public void testbatch(){
		List<Bank> t1=new ArrayList<>();
		for(int i=0;i<10;i++){
			Bank table=new Bank("a"+i, 1+i);
			t1.add(table);
		}
		DeptDao deptDao=new DeptDaoImp();
		deptDao.save(t1);
		
	
	}
 
}