package test;

import java.util.Iterator;

/**
 * ��һ�����ַ������ҳ�����������ִ�������������ĳ��ȷ��أ�������ڳ�����ͬ���������ִ����������һ���������ִ���

ע�⣺���ִ�ֻ��Ҫ��������ɵľͿ��ԣ�����Ҫ��˳�򣬱������ִ���1234���ĳ��Ⱦ�С�����ִ���1359055�������û�����֣��򷵻ؿ��ַ�����������������NULL��
 * @author Administrator
 *
 */

public class finddigital {
	
	public static void main(String[] args) {
		String input="abcd12345ed125ss123456789";
//		int result=finddigital(input);
		int result=finddigitalByRegex(input);
		System.out.println(result);
		
	}
	
	 public static int finddigital( String input) {
		 int maxlength=0; //ͳ��������������ַ�������
	      StringBuffer maxNumberStr = null;//ͳ��������������ַ���
	         
	      int nowlength=0;//��ǰ���������ַ�������
	      StringBuffer nowNumberStr = null;//��ǰ���������ַ�������
		 
		char[] arr=input.toCharArray();
		for(int i=0;i<arr.length;i++) {
			//�ж�������
	
			if (arr[i]>='0'&&arr[i]<='9') {
				
				if(nowlength==0) {  //����ǵ�ǰ�ĵ�һ���ַ�
					nowNumberStr=new StringBuffer();
					nowNumberStr.append(String.valueOf(arr[i]));
					
				}else {     //����ֱ�����
					nowNumberStr.append(String.valueOf(arr[i]));
				}
				nowlength++;
				if(nowlength>=maxlength){
                    maxNumberStr = nowNumberStr;
                    maxlength = nowlength;
                }
				
			}else {
				nowlength=0;
				nowNumberStr=null;
				
			}
		}
		return maxlength;
		 
	 }
	 
	 //��������
	 public static int finddigitalByRegex( String input) {
		 int maxlength=0;
		 String maxString=null;
		 String regex="\\D{1,}";  //�����֣������и�
		 String[] arr=input.split(regex);
		 for (String string : arr) {
			if(string.length()>maxlength) {
				maxlength=string.length();
				maxString=string;
			}
				
		}
		 
		 
		return maxlength;
		 
		 
		 
	 }
	

}
