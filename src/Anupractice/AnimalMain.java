package Anupractice;

public class AnimalMain {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.setLegs(4);
		a.setSound("bow bow");
		int i=a.getLegs();
		String s=a.getSound();
		System.out.println(i);
		System.out.println(s);
		
	}

}