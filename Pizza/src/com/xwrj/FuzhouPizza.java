package com.xwrj;
//���ݷֵ�
public class FuzhouPizza extends PizzaStore{
	public FuzhouPizza() {
		storename = "����";
	}
	
	@Override
	Pizza createPizza(String type) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza = null;
		pizza = factory.createPizza(type);
		return pizza;
	}

}
