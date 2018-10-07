package com.dyf.io.BufferedChar;
/**
 * ʹ���ַ�������ʵ�ִ��ı��ļ���copy
 * BufferReader(),BufferWriter();
 * readLine(),newLine()����������
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
			//ʹ�û������еĶ�ȡһ�еķ��������Է���Ĵ���һЩ��Ҫ���в���������;
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
