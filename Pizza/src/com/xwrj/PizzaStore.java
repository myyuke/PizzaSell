package com.xwrj;
//Pizza店抽象类
public abstract class PizzaStore {
	 public  String storename="";
	 abstract  Pizza createPizza(String type); 
	 abstract String getDough(String city,String type);
	 abstract String getSauce(String city,String type);
	 //顾客预订Pizza方法
     public  Pizza orderPizza(String type) {      
        Pizza pizza = createPizza(type);   
        System.out.println(storename+" pizza is preparing....");
        pizza.prepare();   
//        pizza.bake();   
//        pizza.cut();   
//        pizza.box();
//        System.out.println(pizza);
         return  pizza;   
         }    
    }   

