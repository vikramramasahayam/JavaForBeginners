package com.xyz;
import com.abc.Square;

public class SquareMain {

	public static void main(String[] args) {

      Square s1= new Square(5);
    int a=  s1.area();
    System.out.println(a);
    
    Square s2 = new Square(6);
    int t =s1.area();
    System.out.println(t);
	}

}
