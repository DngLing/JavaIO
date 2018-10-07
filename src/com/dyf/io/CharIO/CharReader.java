package com.dyf.io.CharIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * ʵ�ִ��ı���.txt  .html�ȣ��Ķ�ȡ
 * @author ASUS
 *
 * �������� File
 * ѡ��ڵ��� Reader FileReader(File file);
 * ����������ȡreader.read(flush) ��ȡ��flush�У��ڽ�����ʱ�򷵻�-1;
 * �ر���Դ
 */
public class CharReader {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		File src = new File("E:/www/roc.txt");
		
		Reader reader =null;
		
		try {
			reader = new FileReader(src);
			
			char[] flush =new char[1024];
			int len = 0;
			try {
				while(-1!=(len = reader.read(flush))){
					String str = new String(flush,0,len);
					System.out.println(str);
				}
			} catch (IOException e) {
				System.out.println("��ȡ�ļ�ʧ��");
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Դ�ļ�������");
			e.printStackTrace();
		}finally{
			if(null != reader){
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("�ر���Դʧ��");
					e.printStackTrace();
				}
			}
		}
	}

}
