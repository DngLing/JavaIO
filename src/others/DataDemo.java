package others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据流:可以读取数据+数据类型
 * @author ASUS
 * 1.输入流 DataInputStream 方法read xxx ();
 * 2.输出流 DataOutputStream 方法 write xxx();
 * 3.注意，读取一个储存数据流文件时，读取数据类型的顺序必须一致，不一致会导致不能正确的识别数据
 * 4.以数据流写出的文件并不能直接访问查看，只能又程序识别（暂时）
 * 
 *
 */
public class DataDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "E:/www/data.java";
		write(path);
		read(path);
	}
	
	public static void read(String destPath) throws IOException{
		//创建流
		File src = new File(destPath);
		//选择流(数据流（输入缓冲流（输入流））)
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(src))); 
		
		//读取，必须保证与文件中类型顺序一致
		double num1 =dis.readDouble();
		long num2 =dis.readLong();
		String str =dis.readUTF();
		
		dis.close();
		System.out.println(num1+"-->"+num2+"-->"+str);
	}
	
	public static void write(String destPath) throws IOException{
		double point =2.5;
		long num=100L;
		String str ="数据类型";
		
		File dest = new File(destPath);
		//选择流(与输入同样的使用缓冲流来包装输出流)
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		
		dos.close();
	}

}
