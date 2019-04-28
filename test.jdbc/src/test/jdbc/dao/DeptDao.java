package test.jdbc.dao;

import java.util.List;

import main.entity.javabean.Bank;

public interface DeptDao {
	
	public void query();
	public void insert(String name,String password);
	public void login(String name,String password);
	
	//批量保存插入的操作
	public void save(List<Bank> list);
}
