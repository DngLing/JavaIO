package com.dyf.io.test;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;

/**
 * �����ļ���
 * file.mkdir();����Ŀ¼������ȷ����Ŀ¼���ڣ�����������򴴽�ʧ��
 * file.mkdirs();����Ŀ¼����ͬ����ȷ����Ŀ¼����
 * file.list();����һ��String[] ���浱��Ŀ¼�ڵ������ļ����ļ��е����֣�Ҫ��֤file��һ���ļ���
 * file.listFiles();����һ��File[] ���浱��Ŀ¼�������ļ����ļ��е�Filed����Ҫ��֤file��һ���ļ���
 * 
 * 
 *  */
public class test04 {

	public static void main(String[] args) {
		
	
		
		String path1 = "E:/www/par/test";
		String path2 = "E:/www/par/name/en/";
		String path3 = "E:/www/par";
		
		File file1 = new File(path1);
		File file2 = new File(path2);
		File file3 = new File(path3);
		
		file1.mkdir();
		file2.mkdirs();
		
		String[] names =file3.list();
		System.out.println("===��Ŀ¼||�ļ���===");
		for(String name:names){
			System.out.println(name);
		}
		
		System.out.println("===��Ŀ¼||�ļ���file����");
		File[] subFile = file3.listFiles();
		for(File file : subFile){
			System.out.println(file.getAbsolutePath());
		}
		
		//����ģʽ����  ɸѡ
		System.out.println("===���ļ�||ɸѡ��׺"); 
		File[] subFile1 = file3.listFiles(new FilenameFilter()
			{
				@Override
				public boolean accept(File dir,String name){
					return new File(dir,name).isFile()&&name.endsWith(".txt"); 
				}
			}
		);
				for(File file : subFile1){
					System.out.println(file.getAbsolutePath());
				}
		
		
		//��·�� 
		File[]  file = File.listRoots();
		for(File file9:file)
		{
			test05.printName(file9);
		}
	}

}
