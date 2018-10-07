package com.dyf.io.test;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建文件夹
 * file.mkdir();创建目录，必须确保父目录存在，如果不存在则创建失败
 * file.mkdirs();创建目录链，同样必确保父目录存在
 * file.list();返回一个String[] 保存当下目录内的所有文件和文件夹的名字，要保证file是一个文件夹
 * file.listFiles();返回一个File[] 保存当下目录下所有文件和文件夹的Filed对象，要保证file是一个文件夹
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
		System.out.println("===子目录||文件名===");
		for(String name:names){
			System.out.println(name);
		}
		
		System.out.println("===子目录||文件的file对象");
		File[] subFile = file3.listFiles();
		for(File file : subFile){
			System.out.println(file.getAbsolutePath());
		}
		
		//命令模式查找  筛选
		System.out.println("===子文件||筛选后缀"); 
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
		
		
		//根路径 
		File[]  file = File.listRoots();
		for(File file9:file)
		{
			test05.printName(file9);
		}
	}

}
