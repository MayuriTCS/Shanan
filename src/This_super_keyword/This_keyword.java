package This_super_keyword;

public class This_keyword {// blc
	int a=10;
	public void test() {
		int b=20;
		System.out.println(b);//20
		//now i want to print gobal variable from same class
		System.out.println(this.a);
		
	}

}
