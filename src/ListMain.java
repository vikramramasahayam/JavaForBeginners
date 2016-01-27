import java.text.NumberFormat;
import java.time.Clock;
import java.time.Duration;
import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		boolean b=a.add(10);
		System.out.println(b);
		boolean c=a.add(20);
		System.out.println(c);
		System.out.println(a);
		
		
		 NumberFormat n=NumberFormat.getInstance();		
		 NumberFormat d= NumberFormat.getPercentInstance();
		 Duration h= Duration.ofHours(100000);
		 h.ofMillis(200);
		String u= h.toString();
		 System.out.println(u);
		
		

	}

}
