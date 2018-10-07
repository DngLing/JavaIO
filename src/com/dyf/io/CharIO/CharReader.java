package com.dyf.io.CharIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 实现纯文本（.txt  .html等）的读取
 * @author ASUS
 *
 * 建立链接 File
 * 选择节点流 Reader FileReader(File file);
 * 操作流，读取reader.read(flush) 读取到flush中，在结束的时候返回-1;
 * 关闭资源
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
				System.out.println("读取文件失败");
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("源文件不存在");
			e.printStackTrace();
		}finally{
			if(null != reader){
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("关闭资源失败");
					e.printStackTrace();
				}
			}
		}
	}

}
