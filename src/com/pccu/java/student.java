package com.pccu.java;

import java.util.Scanner;

public class student implements IStudent{
    private int _id;
    private String _name;
    private float _c;
    private float _e;
    private float _m;
    
    public student(){
		Scanner scanner = new Scanner(System.in);
	       
	    System.out.println("plese input ID(int):");
	    setID(scanner.nextInt());
	      
	    System.out.println("plese input name:");
	    setName(scanner.next());
	      
	    System.out.println("plese input three(Chinese,English,Math) score:");
	    float c = scanner.nextFloat();
	    float e = scanner.nextFloat();
	    float m = scanner.nextFloat();
	    setAllScore(c, e, m);
    }
    
    public void setName(String name){
        _name = name;
    }
    public void setID(int id){
    	_id = id;
    }
    public void setChinese(float c){
    	_c = c;
    }
    public void setEnglish(float e){
    	_e = e;
    }  
    public void setMath(float m){
    	_m = m;
    }
    public void setAllScore(float c, float e ,float m){
    	setChinese(c);
    	setEnglish(e);
    	setMath(m);
    }
    
    
    public String getName(){
    	return _name;
    } 

    public int getID(){
    	return _id;
    }   

    public float getChinese(){
    	return _c;
    }   

    public float getEnglish(){
    	return _e;
    }    

    public float getMath(){
    	return _m;
    }
    public void Print(){
    	System.out.println(getChinese());
    	System.out.println(getEnglish());
    	System.out.println(getMath());
    }
    public float getAverage(){
    	return (getChinese()+getEnglish()+getMath())/3;
    }
}
