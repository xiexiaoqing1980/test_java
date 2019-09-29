package com.itheima.aop.test.xml;

import org.springframework.stereotype.Repository;

@Repository(value="")
public class OrderDaoImpl extends A implements OrderDao{

	
	@Override
    public String  save() {
        System.out.println("保存订单...");
       
		return "saving";
    }
 
    @Override
    public void update() {
        System.out.println("修改订单...");
    }
 
    @Override
    public void delete() {
        System.out.println("删除订单...");
    }
 
    @Override
    public void find() {
        System.out.println("查询订单...");
        int c=1/0;
    }
    
    public void other() {
        System.out.println("other...");
        int c=1/0;
    }

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		super.test1();
	}
    
    
    
 

}