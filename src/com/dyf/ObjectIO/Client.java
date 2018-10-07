package com.dyf.ObjectIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ʹ�ö�����ʵ���˶�����ļ���д
 * @author ASUS
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV ch_tv = new TV();
		ch_tv.setName("ch");
		ch_tv.setPrice(1000);
		
		File file = new File("TVinfo.txt");
		
		try {
			//���������ʵ�ֶ���д���ĵ�
			ObjectOutputStream objWrite = new ObjectOutputStream(new FileOutputStream(file));
			objWrite.writeObject(ch_tv);
			objWrite.close();
			
			//�����ȡ��ʵ�ֶ����ȡ
			
			ObjectInputStream objRead = new ObjectInputStream(new FileInputStream(file));
			TV newTV = (TV)objRead.readObject();
			objRead.close();
			
			System.out.println(newTV.getName()+"  "+newTV.getPrice());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
