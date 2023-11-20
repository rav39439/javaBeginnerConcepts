package newpck;
 

public class myvehicle extends Vehicles  {

	
	boolean doublestand;
	
	
	public void stopengine() {
		
		System.out.println("specific : Stop engine");
	}
	

	
	public static void main(String args[]) {
		
		
		myvehicle b1=new myvehicle();
		b1.startengine();//common properties
		b1.stopengine();//common properties
		b1.brand="r15";//common properties
		b1.price=203030;//common properties
		b1.doublestand=true;//specific behaviour
		 b1.stopengin();;//specific behaviour
		 
		 
		 System.out.println("price"+"  "+b1.price +" "+ "brand"+" "+b1.brand + " "+"doublestand"  + "  "+"doublestand"+" "+b1.doublestand);
		
	}
}

