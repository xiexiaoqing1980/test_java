package testfile;

import java.io.File;

public class GetFile {
	public static void main(String[] args) {
//		File dir = getfile();
		File f1=new File("D:\\");
//		getfile("E:\\aaa");
//		getfile("E:\\����.docx");
		int count=0;
		getfile("E:\\΢��web�����߹���",count);
		System.out.println(count);
		
		
		
//	String[] file=dir.list();
//	for (String string : file) {
//		System.out.println(string);
//	}
	}
//��ȡĳ·���µ������ļ�
	public static void getfile(String filePath,int count) {
		File dir=new File(filePath);
		if (!dir.exists()) {
			System.out.println("�ļ�·��������");
		} else if (dir.isFile()) {
			System.out.println("�������ļ���·��");
		}else if(dir.isDirectory()&&dir.listFiles()!=null) {       //��Ҫ�ж��ǲ���Ϊ��
			File[] subfile=dir.listFiles();
			 for (File file : subfile) {    //ֻ�ܻ�ȡ��·���µ��ļ�
//				if (file.isFile()&&file.getName().endsWith(".exe")) {
//					System.out.println(file);
//				}
				 if (file.isFile()) {
					System.out.println(file);
					count++;
//					 return file;
				}else if (file.isDirectory()) {
					 getfile(file.getPath(),count);
				 }
					
				}
		}
//		 else if(dir.isFile()){     //��һ���Ƕ����
//				System.out.println(dir);
//				count++;
//			}
			
		} 
	}
//		return 0;
  



