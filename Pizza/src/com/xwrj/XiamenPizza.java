package com.xwrj;
//���ŷֵ�
public class XiamenPizza extends PizzaStore{
	public XiamenPizza() {
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
