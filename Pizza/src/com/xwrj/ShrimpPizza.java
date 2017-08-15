package com.xwrj;
//œ∫» Pizza
public class ShrimpPizza extends Pizza{
    public ShrimpPizza() {
    	name = "shrimppizza";
		dough="shrimpdough";
		sauce="shrimpsauce";
	}

	@Override
	void bake() {
		System.out.println("shrimppizza bake");
	}

	@Override
	void cut() {
		System.out.println("shrimppizza cut");
	}

	@Override
	void box() {
		System.out.println("shrimppizza box");		
	}
}
