package com.xwrj;
//�˿�ʵ����
public class Customer {
	public static void main(String[] args) {
		FuzhouPizza fuzhouPizza = new FuzhouPizza();
		fuzhouPizza.orderPizza("fruit");
		XiamenPizza xiamenPizza = new XiamenPizza();
		xiamenPizza.orderPizza("beef");
		fuzhouPizza.orderPizza("shrimp");
	}
}
