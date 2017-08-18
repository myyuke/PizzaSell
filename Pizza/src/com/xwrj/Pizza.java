package com.xwrj;
//Pizza主类
public abstract class Pizza {
	    String name;       
	    String dough;  
	    String sauce;   
	    void  prepare() {   
	    	StringBuffer display = new  StringBuffer();   
	        display.append("---- "  + name +  " ----\n" );   
	        display.append("面团:  "+dough + "\n" );   
	        display.append("佐料："+sauce + "\n" );  
	        System.out.println(display);
	    }  
	    //抽象Pizza制作方法
	    abstract void  bake(); 
	    abstract void  cut() ;
	    abstract void  box() ;
	    public  String getName() { return  name;}   
	    public  String toString() {   
	        StringBuffer display = new  StringBuffer();   
	        display.append("---- "  + name +  " ----\n" );   
	        display.append("面团:  "+dough + "\n" );   
	        display.append("佐料："+sauce + "\n" );   
	        return  display.toString();   
	    }  
}
