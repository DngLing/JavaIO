package com.dyf.io.ByteIO;
/**
 * д���ļ�
 * ������ϵ File���� Ŀ�ĵ�
 * ѡ���� */
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.OutputStream;

public class test02 {
	public static void main(String[] args) {
		//������ϵ File���� Ŀ�ĵ�
		File dest = new File("E:/www/par/cdn.txt");
		//ѡ���� �ļ������� OutputStram
		OutputStream os =null;
		
		try {
			//�ڶ�������Ϊtrue��ʾ���ļ���ĩβ׷���ֶΣ�false��Ḳ��ԭ�ļ�
			os = new FileOutputStream(dest,true);
			String str = "i am god \r \n";
			byte[] car = str.getBytes();
			try {
				os.write(car, 0, car.length);//д���ļ�
				os.flush();//ǿ��ˢ��
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
