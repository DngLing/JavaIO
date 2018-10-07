package com.dyf.io.ByteIO;
import java.io.File;
import java.io.IOException;


public class CopyDirUtil {
	
	
	public void copyDirTool(File src,File dest){
		if(src.isDirectory()){
			dest = new File(dest,src.getName());
		}
		this.CopyDir(src,dest);
	}
	
	public void CopyDir(File srcPath,File destPath){
		if(srcPath.isFile()){
			CopyFileUtil cfu = new CopyFileUtil();
			try {
				cfu.copyFile(srcPath,destPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(srcPath.isDirectory()){
			//确保目标文件夹存在
			destPath.mkdirs();
			for(File sub:srcPath.listFiles()){
				CopyDir(sub,new File(destPath,sub.getName()));
			}
		}
	}
	
	 
}


