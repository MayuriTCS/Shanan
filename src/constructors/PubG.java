package constructors;

public class PubG {//user logic class
	public static void main(String[] args) {
		Gun g1=new Gun ();//zero parameter construtor
		g1.gunName= "Ak47" ;
		g1.noOfbullet=6;
		g1.shoot();
		
		
		 Gun g2=new Gun();
		 g2.gunName="Pistol";
		 g2.noOfbullet=10;
		 g2.shoot();
				 
		 
	}

}
