package newpck;

public class Details {
	int price;
	String name;
	String color;
	
	public Details(int p) {
		this.price=p;
		System.out.println("constructor1-got executed");
		System.out.println("value"+" "+this.price+" "+"got initialized");
	}
	public Details(int p, String n ) {
		this.price=p;
		this.name=n;
		System.out.println("constructor2-got executed");
		System.out.println("value"+" "+this.price+" "+this.name+"  "+"got initialized");
	}
	public Details(int p, String n,String c ) {
		this.price=p;
		this.name=n;
		this.color=c;
		System.out.println("constructor3-got executed");
		System.out.println("value"+" "+this.price+"  "+this.name+"  "+"  "+this.color+"  "+"got initialized");
	}
	public static void main(String args[]) {
		Details d1=new Details(45);
		Details d2=new Details(45,"5star");
		Details d3=new Details(45,"5star","blue");


		
	}

}
