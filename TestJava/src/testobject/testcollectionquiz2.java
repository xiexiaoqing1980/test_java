package testobject;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class testcollectionquiz2 {
	public static void main(String[] args) {
		demo1();
		
	}
	
//* ���󣺼���¼��3��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨��
   //1������ѧ���ࣻ��������Ա������tostring
	//2������¼��,����Ϊ5��
	//3��treeset,����
	//4����������ĸ�ʽ�и��װ��student�࣬��ӵ�treeset��
public static void demo1() {
	TreeSet<student> t1=new TreeSet<>(new Comparator<student>() {

		@Override
		public int compare(student o1, student o2) {
			// TODO Auto-generated method stub
			int num=o2.getSum()-o1.getSum();
			return num==0?-1:num;
		}
	});

	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++){
		String line=sc.nextLine();    //��ȡ�ַ���
		String[] arr=line.split(",");  //�ָ�
		int chinese=Integer.parseInt(arr[1]); 
		int math=Integer.parseInt(arr[2]);  
		int english=Integer.parseInt(arr[2]);  //ת��Ϊint��
		t1.add(new student(arr[0],chinese,math,english));
		
	}
	
	for (student student : t1) {
		System.out.println(student);
	}
}	

}

class student{
	
	private String name;
	private int chinese;
	private int math;
	private int english;
	private int sum;
	public student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.sum=this.chinese+this.english+this.math;
	}
	public student() {
		super();
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", chinese=" + chinese + ", math=" + math + ", english=" + english + ", sum=" +sum+"]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
