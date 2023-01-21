package Methods;

public class Static_method_call_from_same_class {
	public static void main(String[] args) {//main method body open
		electricity();
		moneyTransfer();
		recharge();
			
	}//main method body close
	
 public static void moneyTransfer() {// m1 block is open(regular method 1)
	System.out.println("hi");
	System.out.println("bye");
	System.out.println("how r u");
	
	}//m1 block close
  
 public static void recharge() {//regular method 2
	 System.out.println("state");
	 System.out.println("distic");
	 System.out.println("taluka");
	 System.out.println("village"); 

 }//regular method 2 close
 
public static void electricity() {
	System.out.println("ac bill");
	System.out.println("phone bill");
	
	
	
}

}
