package com.xwrj;
//Pizza����
public abstract class Pizza {
	    String name;       
	    String dough;  
	    String sauce;   
	    void  prepare() {   
	    	StringBuffer display = new  StringBuffer();   
	        display.append("---- "  + name +  " ----\n" );   
	        display.append("����:  "+dough + "\n" );   
	        display.append("���ϣ�"+sauce + "\n" );  
	        System.out.println(display);
	    }  
	    //����Pizza��������
	    abstract void  bake(); 
	    abstract void  cut() ;
	    abstract void  box() ;
	    public  String getName() { return  name;}   
	    public  String toString() {   
	        StringBuffer display = new  StringBuffer();   
	        display.append("---- "  + name +  " ----\n" );   
	        display.append("����:  "+dough + "\n" );   
	        display.append("���ϣ�"+sauce + "\n" );   
	        return  display.toString();   
	    }  
}
