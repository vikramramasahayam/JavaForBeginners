import com.abc.Student;

public class PassByReference {
	
	public static void main(String[] args) {
		Student s1 = new Student("Vikram", 12);
		
		System.out.println(s1.name);
		change(s1);
		System.out.println(s1.name);
	
	}
	
	public static void change(Student s){
		s.name="Arun";
	}	

}
