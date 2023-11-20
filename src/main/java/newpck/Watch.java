package newpck;

public class Watch extends Switchclass {

	@Override
	void switchon() {
		// TODO Auto-generated method stub
		
		System.out.println("fan starts rotating");		
	}

	@Override
	void switchoff() {
		// TODO Auto-generated method stub
		System.out.println("Fan will stop rotating");
		
	}
//	String brand;
//	int price;
//	
//	
//	public Watch(String b, int p) {
//		this.brand=b;
//		this.price=p;
//		
//	}
//
//
//	@Override
//	public String toString() {
//		return "Watch [brand=" + brand + ", price=" + price + "]";
//	}
//	
	public static void main(String args[]) {
//		Myemp e1=new Myemp("virat","tcs",40000);
//		Myemp e2=new Myemp("Radha","IBM",50000);
//		Myemp e3=new Myemp("Sachin","Oracle",60000);
//		Watch w1=new Watch("Titan",2000);
//		Watch w2=new Watch("fasttrack",3000);
//		Watch w3=new Watch("Casio",4000);
//		
//		Object x[]= {e1,e2,e3,w1,w2};
//		
//		for(int i=0;i<=4;i++) {
//			System.out.println(x[i]);
//		}
		Watch f=new Watch();
		f.switchon();
		f.switchoff();
	}

	
}
