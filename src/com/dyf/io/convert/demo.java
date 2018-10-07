package com.dyf.io.convert;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ת���������������
 * @author ASUS
 * InputStreamReader(),���ֽ�������ת��Ϊ�ַ���������
 * OutputStreamWriter(),���ֽ������ת��Ϊ�ַ������
 */
public class demo {
	public static void copy(File src, File dest) throws IOException, IOException{
		
		/*BufferedReader bReader =new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(src)),"UTF-8"));
		���������ֽ�ת�ַ������ֽڻ������������ֽ���������File file����,�����뼯������
		ϸ������ ��һ�����Ը��� ���ǽ���ϸ��*/
		//����һ���ֽڻ���������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		
		//����һ���ֽ�ת�ַ�������
		//���ǿ���ָ�������ַ�����������������ȡ���ļ�����Ϊ������Ҫ�ı��뷽ʽ
		InputStreamReader isr = new InputStreamReader(bis);
		//����һ���ַ�����������
		BufferedReader bReader = new BufferedReader(isr);
		
		//ͬ�������Ǵ���һ�������,���ļ�������ϣ���ı��뼯����
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
		OutputStreamWriter osw = new OutputStreamWriter(bos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String line = null;
		while(null!=(line= bReader.readLine())){
			bw.write(line);
			bw.newLine();
		}
		
		bw.close();
		bReader.close();
		bis.close();
		osw.close();
			
	}
	
	public static void main(String[] args) throws IOException{
		File src = new File("E:/www/CopyFile.java");
		File dest  = new File("E:/www/cosd.txt");
		copy(src,dest);
	}
}
