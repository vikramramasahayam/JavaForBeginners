package Statements;

public class Student {
	private int english;
	private int math;
	private String firstName;
	private String lastName;

	public void setMath(int mat) {
		if (mat >= 0 && mat <= 100) {
			this.math = mat;
		}
	}

	public int getMath() {
		return this.math;
	}

	public void setEnglish(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.english = eng;
		}
	}

	public int getEnglish() {
		return this.english;
	}
	
	public void setFirstName(String name){
		this.firstName=name;	
	}
	
	public String getFirstName(){
		return this.firstName;	
	}
	
	public void setLastName(String name){
		this.lastName=name;
	}
	
	public String getLastName(){
		return this.lastName;
	}	
}

