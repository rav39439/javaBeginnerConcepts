package newpck;



public class Car extends Vehicles {

	
//	private String Company;
//	private int price;
//	private String milage;
//	
//	public Car(int p, String c,String m ) {
//		this.price=p;
//		this.Company=c;
//		this.milage=m;
//		System.out.println("constructor3-got executed");
//		System.out.println("value"+" "+this.price+"  "+this.Company+"  "+"  "+this.milage+"  "+"got initialized");
//	}
//	
//	public Car(int p) {
//		this.price=p;
//		System.out.println("constructor1-got executed");
//		System.out.println("value"+" "+this.price+" "+"got initialized");
//	}
//	
//	public Car(int p, String m ) {
//		this.price=p;
//		this.milage=m;
//		System.out.println("constructor2-got executed");
//		System.out.println("value"+" "+this.price+" "+this.milage+"  "+"got initialized");
//	}
	
	void drive() {
		
		System.out.println("drive");
	}
//	
	public static void main(String args[]) {
//		Car d1=new Car(800000);
//		Car d2=new Car(800000,"1200km");
//		Car d3=new Car(800000,"Maruti","1200km");
		
		Car c1=new Car();
		Car c2=new Car();
		
	
		bike b1=new bike();
		bike b2=new bike();
		bike b3=new bike();
		Object x[]= {b1,b2,c1,c2};
		System.out.println(x);
		
		
		
}

}
