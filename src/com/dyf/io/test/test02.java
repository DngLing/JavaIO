package com.dyf.io.test;
/**
 * ���·�������·������File����
 * 1.���·�����������ַ���
 * 		File(String parent , String child)  ==> File("E:/www/par","aaa.txt");
 * 		File(File parent,String child) ==> File(new File("E:/www/par") , "aaa.txt");
 * 2.����·������File�ļ�
 * 		File(filePath);
 * 		ע�⣬��û��ָ���̷�ʱ��������workSpace�����ռ��ִ�������ļ�
 * */
import java.io.File;
public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���·������File����
		String parentPath = "E:/www/par";
		String childPath = "aaa.txt";
		//����һ
		File src1 = new File(parentPath,childPath);
		//������
		File src2 = new File(new File(parentPath),childPath);	
		 //�������
		System.out.println(src1.getName());
		System.out.println(src1.getPath());
		System.out.println(src1.getParent());
		
		
		
		//����·������File�ļ�
		 File src3 = new File("E:/www/par/aaa.txt");
		 System.out.println(src3.getName());
		 System.out.println(src3.getPath());
		 
		 //��û���̷���E:/��ʱ
		 File src4 = new File("test.txt");
		 System.out.println(src4.getName());
		 System.out.println(src4.getPath());
		 System.out.println(src4.getAbsolutePath());
		 //����������Ǿ���·����C:\Users\ASUS\workspace\IO_test\test.txt�������Ե�������workspace�´�������
		 
		
		
		
	}

}
