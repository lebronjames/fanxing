package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 泛型测试
 * 使用泛型
 *
 */
public class FX<T> {

	private T ob; // 定义泛型成员变量  
	  
    public FX(T ob) {  
        this.ob = ob;  
    }  
  
    public T getOb() {  
        return ob;  
    }  
  
    public void showTyep() {  
        System.out.println("T的实际类型是: " + ob.getClass().getName());  
    }  
    
    public static void getData(FX<?> temp) { //此行若把Number换为“？”编译通过  
    	System.out.println("==========getData(FX<Number> temp)=============");
    }  
    
    //上下边界
    public static void getUpperNumberData(FX<? extends Number> temp){  
        System.out.println("class type :" + temp.getClass());  
  }  
    
    public static void main(String[] args) {  
//        FX<Integer> intOb = new FX<Integer>(100);  
//        intOb.showTyep();  
//        System.out.println("value= " + intOb.getOb());  
//        System.out.println("----------------------------------");  
//        
//        FX<String> strOb = new FX<String>("CSDN_SEU_Calvin");  
//        strOb.showTyep();  
//        System.out.println("value= " + strOb.getOb());  
//        System.out.println("----------------------------------");  
        
//    	FX<Number> ex_num = new FX<Number>(100);  
//        FX<Integer> ex_int = new FX<Integer>(200);  
//        getData(ex_num);  
//        getData(ex_int);
//        System.out.println("----------------------------------");  
        
//        FX<Number> ex_num = new FX<Number>(100);  
//        FX<Integer> ex_int = new FX<Integer>(200);  
//        getUpperNumberData(ex_num);  
//        getUpperNumberData(ex_int);
//        System.out.println("----------------------------------");  
        
        List<?>[] lsa = new List<?>[10]; // OK, array of unbounded wildcard type.    
        Object o = lsa;    
        Object[] oa = (Object[]) o;    
        List<Integer> li = new ArrayList<Integer>();    
        li.add(new Integer(3));    
        oa[1] = li; // Correct.    
        Integer i = (Integer) lsa[1].get(0); // OK  
        
    } 
}
