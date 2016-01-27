package Anupractice;

public class ConstructorExplicitly {
	int length;
	int breadth;
	
	public ConstructorExplicitly(){
		System.out.println("zero argument constructer");
	}
	public  ConstructorExplicitly(int l, int b){
		this.length=l;
		this.breadth=b;
		System.out.println("two argument constructer");
	}
	public int area(){
		int k=length*breadth;
		return k;
	}
	public static class ConMain {
        public static void main(String[] args){
	ConstructorExplicitly c1=new ConstructorExplicitly(4,8);
	int k=c1.area();
	System.out.println(k);
			}
	}
}

	


