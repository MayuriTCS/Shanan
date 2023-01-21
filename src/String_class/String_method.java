package String_class;

public class String_method {
	public static void main(String[]args) {
		String s1="velocity";
		String s2= "VELOCITY";
		String s3 ="city";
		
		//length()

		System.out.println(s1.length());//8
		
		//to Uppercase()
		
		System.out.println(s1.toUpperCase());// VELOCITY
		
		// to lowercale()
		
		System.out.println(s2.toLowerCase());// velocity
		//equal()
		
		System.out.println(s1.equals(s2));//false
		//equalignorecase()

		System.out.println(s1.equalsIgnoreCase(s2));//contains()
		
		System.out.println(s1.contains(s3)); //true
		
		System.out.println(s2.contains(s3)); // false
		// charAt()
		
		System.out.println(s1.charAt(7));//y
		//indexof()
		System.out.println(s1.indexOf('y')); //concat()
		
		System.out.println(s1.concat(s3));// velocity
		//substring
		
		System.out.println(s1.substring(4)); //city
		
	    //startswith
		
		System.out.println(s1.startsWith("ve")); // true
		//endswith()
		System.out.println(s1.endsWith("ty"));
		
		
		
	}

}
