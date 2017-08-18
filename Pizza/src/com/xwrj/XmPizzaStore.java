package com.xwrj;
//œ√√≈∑÷µÍ
public class XmPizzaStore extends PizzaStore{
	public XmPizzaStore() {
		storename = "XiaMen";
	}
	@Override
	Pizza createPizza(String type) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza = null;
		pizza = factory.createPizza(type);
		pizza.dough=getDough(storename, type);
		pizza.sauce=getSauce(storename, type);
		return pizza;
	}
	@Override
	String getDough(String city, String type) {
		return MaterialFactory.getDoughMaterial(city, type);
	}
	@Override
	String getSauce(String city, String type) {
		return MaterialFactory.getSauceMaterial(city, type);
	}

}
