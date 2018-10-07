package com.dyf.io.test;
/**
 * 遍历文件夹子孙级目录及文件*/
import java.io.File;

public class test05 {
	
	public static void main(String[] args){
		String path = "E:/www/dir_1";
		File file = new File(path);
		printName(file);
	}
	
	public  static void printName(File src){
		if(null == src||!src.exists()){
			return;
		}
		System.out.println(src.getAbsolutePath());
		
		if(src.isDirectory()){
			for(File file:src.listFiles())
				printName(file);
		}
	}
}
