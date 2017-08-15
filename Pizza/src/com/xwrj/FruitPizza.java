package com.xwrj;
//Ë®¹ûPizza
public class FruitPizza extends Pizza {
	public FruitPizza() {
		name = "fruitpizza";
		dough = "fruitdough";
		sauce = "fruitsauce";
	}

	@Override
	void bake() {
		System.out.println("fruitpizza bake");
	}

	@Override
	void cut() {
		System.out.println("fruitpizza page");
	}

	@Override
	void box() {
		System.out.println("fruitpizza box");
	}
}
