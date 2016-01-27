package com.abc;

public class Student {
	public String name;
	public int rollno;
	
	public Student(){
		System.out.println("Zero argument constructer");
		}
	
	public Student(String name,int no){
		this.name=name;
		System.out.println("2 argument constructer");
		
	}
	public  Student(String name, int no ,int b){
		System.out.println("3 argument constructer");
	}
	

}
