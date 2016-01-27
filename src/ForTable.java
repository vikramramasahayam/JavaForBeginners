import java.util.Scanner;

public class ForTable {
	
	public static void main(String[] args) {
		
		int a,b;
		System.out.println("multiplication table is");
		Scanner in= new Scanner(System.in);
		a=in.nextInt();
		System.out.println("-----");
		for(b=1;b<=10;b++){
			System.out.println(a+"*"+b +"="+(a*b));
			
		}
		
		
		
	}

}
