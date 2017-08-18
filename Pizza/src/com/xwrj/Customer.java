package com.xwrj;
//顾客实体类
public class Customer {
	public static void main(String[] args) {
		FzPizzaStore fuzhouPizza = new FzPizzaStore();
		fuzhouPizza.orderPizza("fruit");
		XmPizzaStore xiamenPizza = new XmPizzaStore();
		xiamenPizza.orderPizza("beef");
		fuzhouPizza.orderPizza("shrimp");
	}
}
