package com.dyf.io.BufferedChar;
/**
 * 使用字符缓冲流实现纯文本文件的copy
 * BufferReader(),BufferWriter();
 * readLine(),newLine()等新增方法
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	public static void copy(File src,File dest){
		
		BufferedReader bReader =null;
		BufferedWriter bWriter = null;
		
		try {
			bReader = new BufferedReader(new FileReader(src));
			bWriter = new BufferedWriter(new FileWriter(dest));
			
			String line = null;
			//使用缓冲流中的读取一行的方法，可以方便的处理一些需要单行操作的数据;
			while(null != (line = bReader.readLine())){
				bWriter.write(line);
				bWriter.newLine();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			try {
				bReader.close();
				bWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args){
		File src = new File("E:/www/CopyFile.java");
		File dest  = new File("E:/www/int.txt");
		copy(src,dest);
	}
	
}
