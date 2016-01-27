
package Statements;

public class OperatinSd {
	public static int total(Student s) {
		int total = s.getMath() + s.getEnglish();
		return total;
	}

	public static String getStudentName(Student st) {
		String k = st.getFirstName() + "  " + st.getLastName();
		return k;

	}

	public char grade(int d) {
		char g;
		if (d < 75) {
			g = 'B';

		} else {
			g = 'A';
		}
		return g;

	}

	public static int divide(int total) {
		int result = total / 2;
		return result;
	}

}
