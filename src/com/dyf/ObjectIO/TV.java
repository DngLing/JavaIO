package com.dyf.ObjectIO;

import java.io.Serializable;

/**
 * һ������ʹ��������д������ ��Ҫ��һ��ʵ�������л�(Serializable)�ӿڵ���
 * ���ཫʵ�����л��ӿ� ����ʹ��Object����ʵ�ֶ�д������
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
