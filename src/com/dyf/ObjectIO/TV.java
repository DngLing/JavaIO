package com.dyf.ObjectIO;

import java.io.Serializable;

/**
 * 一个可以使用流读入写出的类 需要是一个实现了序列化(Serializable)接口的类
 * 该类将实现序列化接口 ，并使用Object流来实现读写操作。
 * @author ASUS
 *
 */
public class TV implements Serializable{
	private String name;
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
