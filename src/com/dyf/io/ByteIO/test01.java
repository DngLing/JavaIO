package com.dyf.io.ByteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 文件的读取操作流程
 * 1.建立联系: File对象
 * 2.选择流: 文件输入流，InputStream FileInputStream
 * 3.操作: 读取文件大小，输出
 * 4.释放资源:关闭流*/
public class test01 {

	public static void main(String[] args) {
		//建立联系
		File src = new File("E:/www/par/aaa.txt");
		//选择流
		InputStream is = null;
		
		try{
			is = new FileInputStream(src);
			//操作流
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
				//关闭资源
				is.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
