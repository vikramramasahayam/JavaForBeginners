package Anupractice;

public class House {
	private int noRooms;
	private String color;
	private static String name;
	
	public void setnoRooms(int i){
		this.noRooms=i;
	}
	
	public int getnoRooms(){
		return this.noRooms;
	}
	
	public void setColor(String s){
		this.color=s;
		}
	
	public String getColor(){
		return this.color;
	}
	
	public static void setName(String s){
		name=s;
	}
	
	public static String getName(){
		return name;
	}
	}
