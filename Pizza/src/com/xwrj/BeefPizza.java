package com.xwrj;
//≈£»‚Pizza
public class BeefPizza extends Pizza{
    public BeefPizza() {
    	name = "beefpizza";
		dough="beefdough";
		sauce="beefsauce";
	}

	@Override
	void bake() {
		System.out.println("beefpizza bake");
		
	}

	@Override
	void cut() {
		System.out.println("beefpizza cut");
	}

	@Override
	void box() {
		System.out.println("beefpizza box");
	}
}
