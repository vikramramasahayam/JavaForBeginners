package Statements;

public class StudentMain {

	public static void main(String[] args) {
    
		Student su=new Student();
		
		 su.setMath(90);
		 su.setEnglish(80);
	int total= OperatinSd.total(su);
	System.out.println(total);
	
	int d=OperatinSd.divide(total);
	System.out.println(d);
	 
	
	OperatinSd op;
	op=new OperatinSd();
	char p=op.grade(d);
	System.out.println(p);
	
	su.setFirstName("shreyan");
	su.setLastName("Ramasahayam");
	String k=OperatinSd.getStudentName(su);
	System.out.println(k);

	}

	
}
