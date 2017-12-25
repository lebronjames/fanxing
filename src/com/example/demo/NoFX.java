package com.example.demo;

/**
 * 
 * 不使用泛型，使用Object
 */
public class NoFX {

	private Object ob; // 定义泛型成员变量  
	  
    public NoFX(Object ob) {  
        this.ob = ob;  
    }  
  
    public Object getOb() {  
        return ob;  
    }  
  
    public void showTyep() {  
        System.out.println("T的实际类型是: " + ob.getClass().getName());  
    }  
    
    public static void main(String[] args) {  
    	NoFX intOb = new NoFX(new Integer(100));  
        intOb.showTyep();  
        System.out.println("value= " + intOb.getOb());  
        System.out.println("----------------------------------");  
  
        NoFX strOb = new NoFX("CSDN_SEU_Calvin");  
        strOb.showTyep();  
        System.out.println("value= " + strOb.getOb());  
        System.out.println("----------------------------------");  
    }  
}
