package com.dyf.io.CharIO;
/**
 * ʵ���ַ�����д��
 * 1.��������
 * 2.ѡ���� Writer FileWriter(File file);
 * 3.������ writer.write(String string,boolean true) д���ַ��������ֽ���������,��һ��true��ʾ׷�ӣ�;
 *	       writer.append(String string) ׷���ַ���;
 *		   writer.flush(); ǿ��ˢ��;
 * 4.�ر���Դ
 * 
 */
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharWriter {
	
	public static void main(String[] args){
		File file = new File("E:/www/test/test.txt");
		
		Writer wr = null;
			try {
				wr = new FileWriter(file);
				String str = "���������ְ�";
				wr.write(str);
				wr.append("���bup");

				wr.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(null!=wr){
					try {
						wr.close();
					} catch (IOException e) {
						
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		
	}
}
