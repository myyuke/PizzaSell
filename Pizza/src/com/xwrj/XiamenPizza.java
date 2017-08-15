package com.xwrj;
//œ√√≈∑÷µÍ
public class XiamenPizza extends PizzaStore{
	public XiamenPizza() {
		storename = "œ√√≈";
	}
	@Override
	Pizza createPizza(String type) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza = null;
		pizza = factory.createPizza(type);
		return pizza;
	}

}
