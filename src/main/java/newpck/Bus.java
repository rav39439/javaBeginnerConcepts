package newpck;

public class Bus extends Vehicles {
	
	public Bus(int p,String s){
		
		this.price=p;
		this.brand=s;
		
	}

	@Override
	public String toString() {
		return "Bus [price=" + price + ", brand=" + brand + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public static void main(String args[]) {
		
		Bus b=new Bus(300000,"newbrand");
		
		
		b.startengine();
		b.stopengin();
		System.out.println(b);
		
	}
	
}
