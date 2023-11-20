package newpck;

public class Methodoverride extends Father {

	final int j=33;
	void drink() {
		
		System.out.println("tea");
	}
	
	
	
	public static void main(String args[]) {
		
		Methodoverride h1=new Methodoverride();
		System.out.println(h1.money);
		h1.drink();
		h1.car();
//	h1.mything=567;
//	h1.j=99;
//	System.out.println(h1.j);
//	
//	System.out.println(h1.mything);

	
	}
}
