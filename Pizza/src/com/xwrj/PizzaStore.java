package com.xwrj;
//Pizza�������
public abstract class PizzaStore {
	 public  String storename="";
	 abstract  Pizza createPizza(String type); 
	 //�˿�Ԥ��Pizza����
     public  Pizza orderPizza(String type) {      
        Pizza pizza = createPizza(type);   
        System.out.println(storename+" pizza is preparing....");
        pizza.prepare();   
        pizza.bake();   
        pizza.cut();   
        pizza.box();
        System.out.println();
         return  pizza;   
         }    
    }   

