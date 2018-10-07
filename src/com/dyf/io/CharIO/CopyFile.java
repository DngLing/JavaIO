package com.dyf.io.CharIO;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * ͨ����д�������ı��ļ�
 * @author ASUS
 * 1.������ϵ
 * 2.ѡ��ڵ���
 * 3.��ȡ�ļ�����>����Ϊ���ı��ļ�
 * 4.�ر���Դ
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
