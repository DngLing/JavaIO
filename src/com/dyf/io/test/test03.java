package com.dyf.io.test;

import java.io.File;
import java.io.IOException;

/**
 *常用方法
 * file.getName();返回名称
 * file.getPath();绝对路径创建的File对象返回完整路径，否则返回相对路径
 * file.getAbsolutePath();返回绝对路径
 * flie.getParent();返回上一级目录，没有上一级mul(相对路径)则返回 null
 * 
 * 
 * file.exists();返回Boolean 判读文件是否存在
 * file.canRead();返回Boolean 判读文件是否可读
 * file.canWrite();返回Boolean 判读文件是否可写
 * file.isFile();返回Boolean 判读是否为文件对象
 * file.isDirectory();返回boolean 判断是否为文件夹对象
 * 
 * file.createFile();返回Boolean 根据file对象的映射路径去创建文件 并判断是否成功（文件已存在返回false）
 * file.delete();返回Boolean 根据file对象的映射路径去删除文件 并判断是否成功（文件不存在返回false）
 * 
 * File.createTempFile(String fileName,".temp",File file);
 * 静态方法，参数分别为:
 * 1.三个字符的文件前缀
 * 2.".temp"临时文件后缀
 * 3.文件File对象
 * 返回说明:
 * 返回一个File对象
 * 
 * 
 * file.deleteOnExit();退出程序时删除文件;
 *  **/
public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File src3 = new File("E:/www/par/aaa.txt");
		 
		 //获取文件名的常用方法
		 System.out.println(src3.getName());//返回名称
		 System.out.println(src3.getPath());//绝对路径的文件返回完整路径，否则返回相对路径
		 System.out.println(src3.getAbsolutePath());//返回绝对路径
		 System.out.println(src3.getParent());//返回上一级目录，如果没有上一级（相对路径），返回null
		 
		 File src4 = new File("E:/www/par/aaa.txt");
		 //判断信息
		 System.out.println("文件是否存在"+src4.exists());//判断文件存不存在
		 System.out.println("文件可读性"+src4.canRead());
		 System.out.println("文件可写性"+src4.canWrite());//可读可写性
		 
		 //路径性质（文件/文件夹）
		 if(src4.isFile()){
			 System.out.println("文件");
			  
		 }else{
			 System.out.println("文件夹");
		 }
		 
		 //判断是否绝对路径
		 System.out.println("是否为绝对路径"+src4.isAbsolute());//判断是否为绝对路径
		 System.out.println("文件长度"+src4.length());//返回文件字节数（大小）,只能返回文件的字节数而不能查看文件夹
		 
		 
		 //创建文件
		 String path = "E:/www/par/td.txt";
		 File file = new File(path);
		 if(!file.exists()){
			 try {
				boolean flag = file.createNewFile();//文件已经存在，返回false
				System.out.println(flag?"成功":"失败");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }

		 //删除文件 
		 System.out.println(file.delete());
		 
		 //创建临时文件
		 //静态方法File.createTempFile(三个字节的前缀,".temp",路径的File对象)
		 try {
			File tmpFile = File.createTempFile("tmpfile", ".temp",new File("E:/www/par/"));
			//退出程序时删除临时文件
			tmpFile.deleteOnExit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		    
	}

}
