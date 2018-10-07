package com.dyf.io.test;

import java.io.File;
import java.io.IOException;

/**
 *���÷���
 * file.getName();��������
 * file.getPath();����·��������File���󷵻�����·�������򷵻����·��
 * file.getAbsolutePath();���ؾ���·��
 * flie.getParent();������һ��Ŀ¼��û����һ��mul(���·��)�򷵻� null
 * 
 * 
 * file.exists();����Boolean �ж��ļ��Ƿ����
 * file.canRead();����Boolean �ж��ļ��Ƿ�ɶ�
 * file.canWrite();����Boolean �ж��ļ��Ƿ��д
 * file.isFile();����Boolean �ж��Ƿ�Ϊ�ļ�����
 * file.isDirectory();����boolean �ж��Ƿ�Ϊ�ļ��ж���
 * 
 * file.createFile();����Boolean ����file�����ӳ��·��ȥ�����ļ� ���ж��Ƿ�ɹ����ļ��Ѵ��ڷ���false��
 * file.delete();����Boolean ����file�����ӳ��·��ȥɾ���ļ� ���ж��Ƿ�ɹ����ļ������ڷ���false��
 * 
 * File.createTempFile(String fileName,".temp",File file);
 * ��̬�����������ֱ�Ϊ:
 * 1.�����ַ����ļ�ǰ׺
 * 2.".temp"��ʱ�ļ���׺
 * 3.�ļ�File����
 * ����˵��:
 * ����һ��File����
 * 
 * 
 * file.deleteOnExit();�˳�����ʱɾ���ļ�;
 *  **/
public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File src3 = new File("E:/www/par/aaa.txt");
		 
		 //��ȡ�ļ����ĳ��÷���
		 System.out.println(src3.getName());//��������
		 System.out.println(src3.getPath());//����·�����ļ���������·�������򷵻����·��
		 System.out.println(src3.getAbsolutePath());//���ؾ���·��
		 System.out.println(src3.getParent());//������һ��Ŀ¼�����û����һ�������·����������null
		 
		 File src4 = new File("E:/www/par/aaa.txt");
		 //�ж���Ϣ
		 System.out.println("�ļ��Ƿ����"+src4.exists());//�ж��ļ��治����
		 System.out.println("�ļ��ɶ���"+src4.canRead());
		 System.out.println("�ļ���д��"+src4.canWrite());//�ɶ���д��
		 
		 //·�����ʣ��ļ�/�ļ��У�
		 if(src4.isFile()){
			 System.out.println("�ļ�");
			  
		 }else{
			 System.out.println("�ļ���");
		 }
		 
		 //�ж��Ƿ����·��
		 System.out.println("�Ƿ�Ϊ����·��"+src4.isAbsolute());//�ж��Ƿ�Ϊ����·��
		 System.out.println("�ļ�����"+src4.length());//�����ļ��ֽ�������С��,ֻ�ܷ����ļ����ֽ��������ܲ鿴�ļ���
		 
		 
		 //�����ļ�
		 String path = "E:/www/par/td.txt";
		 File file = new File(path);
		 if(!file.exists()){
			 try {
				boolean flag = file.createNewFile();//�ļ��Ѿ����ڣ�����false
				System.out.println(flag?"�ɹ�":"ʧ��");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }

		 //ɾ���ļ� 
		 System.out.println(file.delete());
		 
		 //������ʱ�ļ�
		 //��̬����File.createTempFile(�����ֽڵ�ǰ׺,".temp",·����File����)
		 try {
			File tmpFile = File.createTempFile("tmpfile", ".temp",new File("E:/www/par/"));
			//�˳�����ʱɾ����ʱ�ļ�
			tmpFile.deleteOnExit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		    
	}

}
