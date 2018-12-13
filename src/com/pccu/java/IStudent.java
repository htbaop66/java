package com.pccu.java;

public interface IStudent {
	
    void setID(int id);
    int getID();	
	
    void setName(String name);
    String getName();  
    
    void setChinese(float c);
    float getChinese();
    
    void setEnglish(float e);
    float getEnglish();
    
    void setMath(float m);
    float getMath();
    
    void setAllScore(float c, float e ,float m);
    void Print();    
    float getAverage();
}
