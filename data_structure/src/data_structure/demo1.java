package data_structure;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

public class demo1 {
	
	@Test
	public void test1(){
		int sum=0;
		for (int i = 0; i <=100; i++) {
			sum+=i;
			
		}
		
		System.out.println(sum);
		
	}
	
	@Test
	public void test2(){
		int n=100;
		int sum=n*(n+1)/2;
		System.out.println(sum);
		
	}
	
	
	//ʵ������ļ���,���ڣ��в��ڣ��е����ݲ������
	@Test
	public void testUnion(){
		ArrayList aList = new ArrayList();  //���ܳ�ʼ��Ϊ��
		aList.add(11);
		aList.add(22);
		aList.add(33);
		ArrayList blList = new ArrayList();
		
		blList.add(66);
		blList.add(77);
		blList.add(33);
//		Object elem;
//		int lenA =aList.size();
//		int lenB=blList.size();
		
		for (Object bObject : blList) {
			 if (!aList.contains(bObject)) {
				 aList.add(bObject);
			}
			
			}
		for (Object object : aList) {
			System.out.println(object);
		}
		
			
		
//		
//		for (int i = 0; i < lenB; i++) {
//			elem=blList.get(i);  //����I�����ݸ�ֵ��elem
//			if () {
//				
//			}
//			
//		}
		
		
		
	}

}
