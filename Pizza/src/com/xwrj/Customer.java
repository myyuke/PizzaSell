package com.xwrj;
//�˿�ʵ����
public class Customer {
	public static void main(String[] args) {
		FzPizzaStore fuzhouPizza = new FzPizzaStore();
		fuzhouPizza.orderPizza("fruit");
		XmPizzaStore xiamenPizza = new XmPizzaStore();
		xiamenPizza.orderPizza("beef");
		fuzhouPizza.orderPizza("shrimp");
	}
}
