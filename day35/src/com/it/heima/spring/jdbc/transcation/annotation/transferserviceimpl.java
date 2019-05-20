package com.it.heima.spring.jdbc.transcation.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Service(value="transferservice")
@Transactional  //开启了事物的意思
public class transferserviceimpl implements transferdaoservice {
	
	@Resource(name="accountdao")
	private transferdao dao;
	
	/*//注入事物管理的模板
	@Resource(name="transcationtemplate")
	private TransactionTemplate template;*/

	@Override
	public void transfer(final String from, final String to, final double money) {
	
		
		dao.transferfrom(from, money);
//		//此时出现了异常的话就可能有问题，因此需要开启事务
//		
//		//开始编写事物管理的代码
//	
		int a=1/0;
		dao.transferto(to, money);
		
	}

	

}
