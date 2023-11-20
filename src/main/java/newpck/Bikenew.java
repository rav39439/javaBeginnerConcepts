package newpck;

public class Bikenew extends Vehicles {

	
	public Bikenew(int p , String s){
		
		this.price=p;
		this.brand=s;
		
	}
	
	@Override
	public String toString() {
		return "Bikenew [price=" + price + ", brand=" + brand + "]";
	}

	public static void main(String args[]) {
		
		Bikenew b=new Bikenew(34000,"Suzuki");
		System.out.println(b);
		b.startengine();
		b.stopengin();
		
	}
}
