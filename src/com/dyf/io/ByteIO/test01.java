package com.dyf.io.ByteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * �ļ��Ķ�ȡ��������
 * 1.������ϵ: File����
 * 2.ѡ����: �ļ���������InputStream FileInputStream
 * 3.����: ��ȡ�ļ���С�����
 * 4.�ͷ���Դ:�ر���*/
public class test01 {

	public static void main(String[] args) {
		//������ϵ
		File src = new File("E:/www/par/aaa.txt");
		//ѡ����
		InputStream is = null;
		
		try{
			is = new FileInputStream(src);
			//������
			byte[] car = new byte[100];
			int len =0;
			while(-1!=(len = is.read(car)))	{
				String info = new String(car,0,len);
				System.out.println(info);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				//�ر���Դ
				is.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
