package Anupractice;

abstract class Animal {
	private String sound;
	private int legs;
	
	
	public Animal(){
		System.out.println("zero argument constructer");
	}
	
	public void setSound(String s){
		this.sound=s;
	}
	
	public String getSound(){
		return this.sound;
	}
	
	public void setLegs(int i){
		this.legs=i;
	}
	
	public int getLegs(){
		return this.legs;
	}
	public abstract String getColor();
	public abstract void setColor(String s);

//	
//	 class main{
//		public static void main(String args[]){
//			Animal a =new Animal();
//			int s=a.getLegs();
//			String p=a.getSound();
//			a.setLegs(4);
//			a.setSound("bow bow");
//			System.out.println(s);
//			System.out.println(p);
//			
//			
//			
//		}
//	}

//	public int getLegsCount(int i) {
//		return 4;
//	}
	}
