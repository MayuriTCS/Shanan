package Hirarchicle;

public class Hirarchy_Inheritance {//ULC
	public static void main(String[] args) {
		
	 {
		Son1 s1=new Son1();// object 1 
		s1.home();
		s1.car();
		s1.money();
		s1.Secbike();
		System.out.println("properties of Son1");//1@12345
		System.out.println(s1);
		
		Son2 s2=new Son2(); // object2
		s2.car();
		s2.home();
		s2.money();
		s2.seclappy();
		System.out.println("properties of son2"); 
		System.out.println("s2");
		
		Son3 s3=new Son3();// object3
		s3.secMobile();
		s3.home();
		s3.car();
		s3.money();
		System.out.println("properties of s3");
			
	}
	
		
	}
}


