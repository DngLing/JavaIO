package com.dyf.RandomIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

final class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomAccessFile inAndOut = null;
		int data[]={0,1,2,3,4,5,6,7};
		
		try {
			inAndOut = new RandomAccessFile("cdn.txt","rw");
			for(int i=1;i<data.length;i++){
				inAndOut.writeInt(data[i]);
			}
			
			for(long i = data.length-1;i>=0;i--){
				inAndOut.seek(i*4);
				System.out.printf("\t%d",inAndOut.readInt());
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally{
			try {
				inAndOut.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
	}

}
