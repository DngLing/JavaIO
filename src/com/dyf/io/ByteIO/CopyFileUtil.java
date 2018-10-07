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
	 * 文件的copy
	 * @param String srcPath 源文件路径
	 * @param String destPath 目的地路径
	 * @throws IOException
	 * @return void*/ 

	public  void copyFile(File src,File dest) throws IOException {
		// 1、源文件和目的地，源文件必须存在，目的地可以不存在（新建或追加或覆盖）
		if(!src.isFile()){
			throw new IOException("只能复制文件");
		}
		
		if(dest.isDirectory()){
			throw new IOException(dest.getName()+"不能建立与文件夹同名的文件！");
		}
		
		//创建流
		 InputStream is  = new FileInputStream(src);
		 OutputStream os = new FileOutputStream(dest);
		 
		 
		 //读写 文件拷贝
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
