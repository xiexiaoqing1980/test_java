package testobject;

public class TestInnerClass {
	public static void main(String[] args) {
//		outer.inner in=new outer().new inner();  //���������ķ�ʽ��
//		in.name();           //Ҫ���ʱ��봴������
		
		outer o1=new outer();
		o1.print();
	}
}
class outer{
	
	private int num=10;
	private class inner{             //˽�����ڲ��࣬outer.inner in=new outer().new inner();������������
		public void name() {
			System.out.println(num);   //�ڲ������ֱ�ӷ����ⲿ�ı�����
		}
	}
	public void print(){              //�ڲ���˽��֮��ֻ�����ⲿ����ڲ�������
		inner i=new inner();
		i.name();
	}
	
}