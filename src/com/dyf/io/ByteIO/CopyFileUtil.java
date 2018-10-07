package com.dyf.io.ByteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * **/
public class CopyFileUtil {

	/**
	 * �ļ���copy
	 * @param String srcPath Դ�ļ�·��
	 * @param String destPath Ŀ�ĵ�·��
	 * @throws IOException
	 * @return void*/ 

	public  void copyFile(File src,File dest) throws IOException {
		// 1��Դ�ļ���Ŀ�ĵأ�Դ�ļ�������ڣ�Ŀ�ĵؿ��Բ����ڣ��½���׷�ӻ򸲸ǣ�
		if(!src.isFile()){
			throw new IOException("ֻ�ܸ����ļ�");
		}
		
		if(dest.isDirectory()){
			throw new IOException(dest.getName()+"���ܽ������ļ���ͬ�����ļ���");
		}
		
		//������
		 InputStream is  = new FileInputStream(src);
		 OutputStream os = new FileOutputStream(dest);
		 
		 
		 //��д �ļ�����
		 byte[] flush = new byte[1024];
		 int len =0;
		 while(-1!=(len = is.read(flush))){
			 os.write(flush, 0, len);
		 }
		 os.flush();
		 os.close();
		 is.close();		  
	}
}
