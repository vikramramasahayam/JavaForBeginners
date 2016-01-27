package com.java2s.examples;

public class Student {
	
	public static String getName(){
		return "Vikram";
	}
	
	public String getLastName(){
		return "Ramasahayam";
	}

	public String getMiddleName(){
		return "Reddy";
	}
	public static void main(String[] args) {
		String s;
		s=Student.getName();
		System.out.println(s);
		
		
//		Student p;
//		p= new Student();
//		String r;
//		r=p.getMiddleName();
//		System.out.println(r);
//		
		Student a;
		a=new Student();
		String v;
		v=a.getLastName();
		String r;
		r=a.getMiddleName();
		System.out.println(r);
		System.out.println(v);
	}
}
