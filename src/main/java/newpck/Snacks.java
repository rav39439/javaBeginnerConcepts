package newpck;

public class Snacks {

	String name;
	int price;
	
	Snacks(String n ,int p){
		this.name=n;
		this.price=p;
		
	}
	
	public static void main(String args[]) {
		
		Snacks s1=new Snacks("Burger",90);
		Snacks s2=new Snacks("samosa",10);
		Snacks s3=new Snacks("lays",20);
		
		Snacks s4=new Snacks("shawarma",50);
		Snacks s5=new Snacks("Dosa",25);
		Snacks s6=new Snacks("Sandwich",60);
		
		Snacks snack[]= {s1,s2,s3,s4,s5,s6};
		for(int i=0;i<6;i++) {
			System.out.println("name"+" "+snack[i].name +" , "+"price"+" "+snack[i].price);
		}



	}
}
