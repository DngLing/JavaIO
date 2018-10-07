package com.dyf.io.CharIO;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 通过读写拷贝纯文本文件
 * @author ASUS
 * 1.建立联系
 * 2.选择节点流
 * 3.读取文件——>保存为纯文本文件
 * 4.关闭资源
 */
public class CopyFile {
	public static void copyFile(File src,File dest){
		Reader reader= null;
		Writer writer= null;
		
		try {
			reader = new FileReader(src);	
		    writer = new FileWriter(dest);
		    
		    char[] flush = new char[1024];
		    int len = 0;
		    while(-1!=(len = reader.read(flush))){
		    	writer.write(flush,0,len);
		    }
	
		} catch (IOException e) {
					e.printStackTrace();
		}finally{
			try {
				writer.close();
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args){
		File src = new File("E:/www/c/e/hgas.txt");
		File dest = new File("E:/www/mc.txt");
		
		copyFile(src,dest);
	}
	
	
}
