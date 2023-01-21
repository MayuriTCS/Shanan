package Conditional_statement;

public class if_else_ladder {
	public static void main(String[] args) {
		int marks=100;
		if(marks>=65) {
			System.out.println("pass with distinction");
			System.out.println("hi how are u");
			
		}
		else if (marks>=50) {
			System.out.println("pass with 1st class");
			
		}
		else if (marks>=40) {
			System.out.println("pass with 2nd class");
			
		}
		else if (marks>=35) {
			System.out.println("successfully fail");
		}
}

}
