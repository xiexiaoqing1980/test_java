package testobject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;

import testobject.outer2.inner2;

public class collectionquiz {
public static void main(String[] args) {
//��һ�������д洢���������ظ����ַ���,����һ������,��������(�ֵ�˳��),���һ�����ȥ���ظ�
//   demo1();
//* �Ӽ��̽���һ���ַ���, ��������������ַ���������,�����������: helloitcast�����ӡ:acehillostt
//  demo2();

//����������, ���ԴӼ���������ն������, ֱ������quitʱ��������. ����������������������д�ӡ.
//demo3();
  

 
}


public static void demo3() {
	Scanner scanner=new Scanner(System.in);
	TreeSet<Integer> t1=new TreeSet<>(new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			int num=o2.compareTo(o1);
			return num==0?1:num;
		}
	});
	
//	
	while(scanner.hasNextLine()){
		String line=scanner.nextLine();
		if (line.equals("quit")) {
			break;
		}
		Integer i=Integer.parseInt(line);
		t1.add(i);
	}
	System.out.println(t1);
}

public static void demo2() {
	String a="fhgjhruti";
	char[] arr=a.toCharArray(); //�洢���ַ�������
	TreeSet<Character> t1=new TreeSet<>(new Comparator<Character>() {

		@Override
		public int compare(Character o1, Character o2) {
			// TODO Auto-generated method stub
			int num=o1.compareTo(o2);
			return num==0? -1:num;
		}
		
	});
			
	for (Character character : arr) {
		
		t1.add(character);  //��ӵ�t1��
		}
	StringBuilder sBuilder=new StringBuilder();  //�ַ������
	for (Character character : t1) {
		sBuilder.append(character);
	}
	System.out.println(sBuilder);
	

}
public static void demo1() {
	//˼·������compareto���������
		
	//	1������List�洢�ظ����ַ���
	//    2�����������洢�ظ����ַ��������� ���ڷ������ٴ���treeset���ϣ�
	//       1������treeset���϶��� ����ΪString����߱��ȽϹ��ܣ������ظ��Ĳ��ᱣ������                   �������ñȽ���
	//        2����LIST��Ԫ����ӵ�treeset���ϣ��������򣬱����ظ�
	//        3�����list
	//        4����treeset�洢��list��
		ArrayList<String> list=new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("bb");
		sort_arr(list);   //���[aaa, aaa, bb]
}

  public static void sort_arr(List<String> list) {
	TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			int num=o1.compareTo(o2);
			return num==0?-1:num;
			// TODO Auto-generated method stub
			
		}

	});
ts.addAll(list);
list.clear();
list.addAll(ts);

System.out.println(list);
	
}
  
  
}
