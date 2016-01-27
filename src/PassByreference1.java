 import com.abc.Box;

   public class PassByreference1 {
	
	public static void main(String[] args) {
		Box b1 = new Box(10,10);
		
		System.out.println(b1.height);
		change(b1);
		System.out.println(b1.height);
		
	}
	
	public static void change(Box b){
		b.height=20;
	}	

}

		
	
	


