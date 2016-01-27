
public class IfElse {

	public static void main(String[] args) {
		int i=5;
	int j=10;
	
	/*evenodd(j);
	evenodd(5);*/
	division(i,j);
	division(11,2);
	}

      
	public static void evenodd(int i,int j){
	
		if(i%2==0){
			System.out.println("even:" +i);
			
		}else
		{
			System.out.println("odd:" +i );
		}
		
		}
	public static void division(int i,int j){
		if(j%i==0){
			System.out.println("true:");
		}else {
		System.out.println("false");
		}
	}

}
