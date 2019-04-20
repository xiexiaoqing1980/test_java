package testobject;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class testcollectionquiz2 {
	public static void main(String[] args) {
		demo1();
		
	}
	
//* 需求：键盘录入3个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
   //1、定义学生类；变量，成员方法，tostring
	//2、键盘录入,限制为5个
	//3、treeset,降序
	//4、按照输入的格式切割，包装成student类，添加到treeset中
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
		String line=sc.nextLine();    //获取字符串
		String[] arr=line.split(",");  //分割
		int chinese=Integer.parseInt(arr[1]); 
		int math=Integer.parseInt(arr[2]);  
		int english=Integer.parseInt(arr[2]);  //转换为int数
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
