package testfile;

import java.io.File;

public class GetFile {
	public static void main(String[] args) {
//		File dir = getfile();
		File f1=new File("D:\\");
//		getfile("E:\\aaa");
//		getfile("E:\\正文.docx");
		int count=0;
		getfile("E:\\微信web开发者工具",count);
		System.out.println(count);
		
		
		
//	String[] file=dir.list();
//	for (String string : file) {
//		System.out.println(string);
//	}
	}
//获取某路径下的所有文件
	public static void getfile(String filePath,int count) {
		File dir=new File(filePath);
		if (!dir.exists()) {
			System.out.println("文件路径不存在");
		} else if (dir.isFile()) {
			System.out.println("请输入文件夹路径");
		}else if(dir.isDirectory()&&dir.listFiles()!=null) {       //需要判断是不是为空
			File[] subfile=dir.listFiles();
			 for (File file : subfile) {    //只能获取到路径下的文件
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
//		 else if(dir.isFile()){     //这一步是多余的
//				System.out.println(dir);
//				count++;
//			}
			
		} 
	}
//		return 0;
  



