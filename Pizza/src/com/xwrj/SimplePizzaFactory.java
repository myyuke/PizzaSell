package com.xwrj;

public class SimplePizzaFactory {
	//生产不同种类Pizza
	public Pizza createPizza(String type){
	    Pizza pizza = null;
	if(type.equals("fruit")){
	    pizza = new FruitPizza();
	  }else if(type.equals("beef")){
	    pizza = new BeefPizza();
	  }else if(type.equals("shrimp")){
	    pizza = new ShrimpPizza();
	  }
	    return pizza;
	  }
}
