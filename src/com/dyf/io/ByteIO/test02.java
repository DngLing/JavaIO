package com.dyf.io.ByteIO;
/**
 * 写出文件
 * 建立联系 File对象 目的地
 * 选择流 */
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.OutputStream;

public class test02 {
	public static void main(String[] args) {
		//建立联系 File对象 目的地
		File dest = new File("E:/www/par/cdn.txt");
		//选择流 文件输入流 OutputStram
		OutputStream os =null;
		
		try {
			//第二个参数为true表示从文件的末尾追加字段，false则会覆盖原文件
			os = new FileOutputStream(dest,true);
			String str = "i am god \r \n";
			byte[] car = str.getBytes();
			try {
				os.write(car, 0, car.length);//写出文件
				os.flush();//强制刷新
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
