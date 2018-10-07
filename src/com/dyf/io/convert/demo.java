package com.dyf.io.convert;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 转换流解决乱码问题
 * @author ASUS
 * InputStreamReader(),将字节输入流转化为字符输入流。
 * OutputStreamWriter(),将字节输出流转化为字符输出流
 */
public class demo {
	public static void copy(File src, File dest) throws IOException, IOException{
		
		/*BufferedReader bReader =new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(src)),"UTF-8"));
		缓冲流（字节转字符流（字节缓冲输入流（字节输入流（File file））,“解码集”））
		细化步骤 这一步略显复杂 我们将其细化*/
		//创建一个字节缓冲输入流
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		
		//创建一个字节转字符输入流
		//我们可以指定解码字符集，来将我们所读取的文件解码为我们想要的编码方式
		InputStreamReader isr = new InputStreamReader(bis);
		//创建一个字符缓冲输入流
		BufferedReader bReader = new BufferedReader(isr);
		
		//同样的我们创建一个输出流,将文件以我们希望的编码集编码
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
		OutputStreamWriter osw = new OutputStreamWriter(bos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String line = null;
		while(null!=(line= bReader.readLine())){
			bw.write(line);
			bw.newLine();
		}
		
		bw.close();
		bReader.close();
		bis.close();
		osw.close();
			
	}
	
	public static void main(String[] args) throws IOException{
		File src = new File("E:/www/CopyFile.java");
		File dest  = new File("E:/www/cosd.txt");
		copy(src,dest);
	}
}
