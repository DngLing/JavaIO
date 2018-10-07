package com.dyf.io.ByteIO;

import java.io.File;
import java.io.IOException;

public class CopyDirTool {
	/**
	 * 
	 * @author ASUS
	 * @实现功能:递归地拷贝文件夹及文件夹下的文件
	 * @使用的类已经方法:CopyFileUtil.copyFile();
	 * @param src :源目录
	 * @param dest :复制的目标路径
	 * @return void
	 */
	public static void copy(File src, File dest){
		if(!src.exists()||src == null){
			return;
		}
		else if(src.isDirectory()){
			dest = new File(dest,src.getName());
			dest.mkdirs();
			for(File sub:src.listFiles()){
				copy(sub,new File(dest,sub.getName()));
				System.out.println("dirc");
			}
		}else
		{
			CopyFileUtil c = new CopyFileUtil();
			try {
				c.copyFile(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
