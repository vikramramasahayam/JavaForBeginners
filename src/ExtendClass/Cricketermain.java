package ExtendClass;

public class Cricketermain {

	public static void main(String[] args) {

//	Cricketer cr=new Cricketer();
	Cricketer cr=new Spinner();
	cr.setName("...vikram...");
	cr.setCountry("...India...");
	
	String s=cr.getName();
	String k=cr.getCountry();
	System.out.println(s);
	System.out.println(k);
//	Bowler b= new Bowler();
	
//	Bowler b =(Bowler)cr;
	((Bowler)cr).setHand("...LeftHand...");
	String j=((Bowler)cr).getHand();
	System.out.println(j);
	
	cr.setType("...speedSpinner...");
	String d=cr.getType();
	System.out.println(d);
	
	((Spinner)cr).sayHello();
	
	}

}
