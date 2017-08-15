package com.xwrj;
//¸£ÖÝ·Öµê
public class FuzhouPizza extends PizzaStore{
	public FuzhouPizza() {
		storename = "¸£ÖÝ";
	}
	
	@Override
	Pizza createPizza(String type) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza = null;
		pizza = factory.createPizza(type);
		return pizza;
	}

}
