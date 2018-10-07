package com.dyf.io.CharIO;
/**
 * 实现字符流的写出
 * 1.建立链接
 * 2.选择流 Writer FileWriter(File file);
 * 3.操作流 writer.write(String string,boolean true) 写入字符串（与字节流的相似,有一个true表示追加）;
 *	       writer.append(String string) 追加字符串;
 *		   writer.flush(); 强制刷出;
 * 4.关闭资源
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
				String str = "你好我是你爸爸";
				wr.write(str);
				wr.append("真的bup");

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
