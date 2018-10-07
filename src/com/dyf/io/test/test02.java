package com.dyf.io.test;
/**
 * 相对路径与绝对路径构造File对象
 * 1.相对路径创建的两种方法
 * 		File(String parent , String child)  ==> File("E:/www/par","aaa.txt");
 * 		File(File parent,String child) ==> File(new File("E:/www/par") , "aaa.txt");
 * 2.绝对路径创建File文件
 * 		File(filePath);
 * 		注意，当没有指定盘符时，他会在workSpace工作空间种创建这个文件
 * */
import java.io.File;
public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//相对路径创建File对象
		String parentPath = "E:/www/par";
		String childPath = "aaa.txt";
		//方法一
		File src1 = new File(parentPath,childPath);
		//方法二
		File src2 = new File(new File(parentPath),childPath);	
		 //输出测试
		System.out.println(src1.getName());
		System.out.println(src1.getPath());
		System.out.println(src1.getParent());
		
		
		
		//绝对路径创建File文件
		 File src3 = new File("E:/www/par/aaa.txt");
		 System.out.println(src3.getName());
		 System.out.println(src3.getPath());
		 
		 //在没有盘符“E:/”时
		 File src4 = new File("test.txt");
		 System.out.println(src4.getName());
		 System.out.println(src4.getPath());
		 System.out.println(src4.getAbsolutePath());
		 //这里输出的是绝对路径“C:\Users\ASUS\workspace\IO_test\test.txt”，明显的这是在workspace下创建了它
		 
		
		
		
	}

}
