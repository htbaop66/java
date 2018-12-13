package com.pccu.java;
import java.util.*;

public class MyMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Vector Vstudent = new Vector();
        
        while(true){
        	System.out.println("\ninput '1' to Add new student");
        	//System.out.println("input '2' to Enter ID query score and average");
        	//System.out.println("input '3' to print students score & order");
        	
        	switch(scanner.nextInt()){
        	    case 1://加入新的学生资料＆整理
        	    	AddNewStudent(Vstudent);
        	    	break;
        	    /*case 2://以学生id搜寻学生成绩
        	    	StudentID(Vstudent);
        	    	break;
        	    case 3://列印排序後學生成績
        	    	PrintAllStudent(Vstudent);
        	    	break;
        	    default:
        	    	System.out.println("error");
        	    	break;*/
        	}        	     
        }       
	}
	private static void WritwFile(ArrayList<student> list,String filepath) {
		
	}
	
    public static void AddNewStudent(Vector Vstudent){
	    Scanner scanner = new Scanner(System.in);
        student newStudent = new student();
        
        for(int i=0;i<Vstudent.size();i++){//比较学生分数平均＆加入新学生资料
        	student student = (student)Vstudent.get(i);
            if	( student.getAverage() < newStudent.getAverage()){
            	Vstudent.add(i,newStudent);
            	return;//跳出此function
            	
            }
        }        
        Vstudent.add(newStudent); //加在最后
        WritwFile (list, "src/score.txt");
    }
    

    /*public static void StudentID(Vector Vstudent){
    	Scanner scanner = new Scanner(System.in);
    	int searchID = scanner.nextInt();
    	
    	for(int i=0;i<Vstudent.size();i++){
    		student student = (student)Vstudent.get(i);
    		if(student.getID() == searchID){
    			System.out.println("Student Name:");
    			student.getName();
    			System.out.println("Student Score:");
    			student.Print();
    			System.out.println("Student Average:");
    			student.getAverage();
    			return;
    		}
    	} 	
    }
    public static void PrintAllStudent(Vector Vstudent){
    	for(int i=0;i<Vstudent.size();i++){
    		student student = (student)Vstudent.get(i);
    		System.out.println("Name:" + student.getName() + " , Average:" + student.getAverage());
    	}    	
    }  */  
}
