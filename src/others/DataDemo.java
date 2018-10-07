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
 * ������:���Զ�ȡ����+��������
 * @author ASUS
 * 1.������ DataInputStream ����read xxx ();
 * 2.����� DataOutputStream ���� write xxx();
 * 3.ע�⣬��ȡһ�������������ļ�ʱ����ȡ�������͵�˳�����һ�£���һ�»ᵼ�²�����ȷ��ʶ������
 * 4.��������д�����ļ�������ֱ�ӷ��ʲ鿴��ֻ���ֳ���ʶ����ʱ��
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
		//������
		File src = new File(destPath);
		//ѡ����(�����������뻺����������������)
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(src))); 
		
		//��ȡ�����뱣֤���ļ�������˳��һ��
		double num1 =dis.readDouble();
		long num2 =dis.readLong();
		String str =dis.readUTF();
		
		dis.close();
		System.out.println(num1+"-->"+num2+"-->"+str);
	}
	
	public static void write(String destPath) throws IOException{
		double point =2.5;
		long num=100L;
		String str ="��������";
		
		File dest = new File(destPath);
		//ѡ����(������ͬ����ʹ�û���������װ�����)
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		
		dos.close();
	}

}
