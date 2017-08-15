package com.xwrj;
//Pizza����
public abstract class Pizza {
	    String name;       
	    String dough;  
	    String sauce;   
	    void  prepare() {   
	        System.out.println("Preparing "  + name);   
	        System.out.println("Tossing dough..." );   
	        System.out.println("Adding sauce..." );   
	    }  
	    //����Pizza��������
	    abstract void  bake(); 
	    abstract void  cut() ;
	    abstract void  box() ;
	    public  String getName() { return  name;}   
	    public  String toString() {   
	        StringBuffer display = new  StringBuffer();   
	        display.append("---- "  + name +  " ----/n" );   
	        display.append(dough + "/n" );   
	        display.append(sauce + "/n" );   
	        return  display.toString();   
	    }  
}
