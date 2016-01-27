package Anupractice;

public class HouseMain {
	public static void main(String[] args) {
		House h=new House();
		h.setColor("Red");
		h.setnoRooms(4);
		String s=h.getColor();
		int i=h.getnoRooms();
		System.out.println(s);
		System.out.println(i);
		
		House.setName("shreyan's house");
		String p=House.getName();
		System.out.println(p);
		
		h.setName("sweet home");
		String k=h.getName();
		System.out.println(k);
		
	}

}
