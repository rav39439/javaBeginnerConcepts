package newpck;

public class mycar extends Vehicles {
public mycar(int p , String s){
		
		this.price=p;
		this.brand=s;
		
	}
	
	@Override
	public String toString() {
		return "Bikenew [price=" + price + ", brand=" + brand + "]";
	}

	public static void main(String args[]) {
		
		mycar b=new mycar(340000,"maruti");
		System.out.println(b);
		b.startengine();
		b.stopengin();
		
	}
}
