package com.dyf.ObjectIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 使用对象流实现了对象的文件读写
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
			//对象输出流实现对象写入文档
			ObjectOutputStream objWrite = new ObjectOutputStream(new FileOutputStream(file));
			objWrite.writeObject(ch_tv);
			objWrite.close();
			
			//对象读取流实现对象读取
			
			ObjectInputStream objRead = new ObjectInputStream(new FileInputStream(file));
			TV newTV = (TV)objRead.readObject();
			objRead.close();
			
			System.out.println(newTV.getName()+"  "+newTV.getPrice());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
