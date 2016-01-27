
public class PassbyValue {
	public static void main(String[] args) {
		int i = 20;
		System.out.println("i value inside main :"+i);
		add(i);
		System.out.println("i value after add :" +i);
		
	}
	public static void add(int i) {
		i = i+20;
		System.out.println("i value is :" +i);
	}

}
