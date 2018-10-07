package com.dyf.io.ByteIO;

import java.io.File;
import java.io.IOException;

public class CopyDirTool {
	/**
	 * 
	 * @author ASUS
	 * @ʵ�ֹ���:�ݹ�ؿ����ļ��м��ļ����µ��ļ�
	 * @ʹ�õ����Ѿ�����:CopyFileUtil.copyFile();
	 * @param src :ԴĿ¼
	 * @param dest :���Ƶ�Ŀ��·��
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
