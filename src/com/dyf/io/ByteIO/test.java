package com.dyf.io.ByteIO;

import java.io.File;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("E:/www/e");
		File dest = new File("E:/www/d");
		CopyDirTool.copy(src, dest);
		
		
	}

}
