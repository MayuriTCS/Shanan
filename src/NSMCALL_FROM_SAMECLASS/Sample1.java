package NSMCALL_FROM_SAMECLASS;

public class Sample1{
public static void main(String[] args) {
	System.out.println("main method started");
	Sample1 s= new Sample1();
	s.m1();
	s.m2();

	System.out.println("main method ends");
}
public void m1() {//method declaration
	System.out.println("i am from m1 non static method");
	//method implementation
	
}
 public void m2() 
 {//method implementation
	 System.out.println("i am from m2 non ststic method");
	 //method implementation
 }
}
