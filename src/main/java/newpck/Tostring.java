package newpck;

public class Tostring {
String color;
String name;
int price;


@Override
public String toString() {
	return "Tostring [color=" + color + ", name=" + name + ", price=" + price + "]";
}


public static void main(String args[]) {
	Tostring p1=new Tostring();
	
	p1.name="cello";
	p1.color="blue";
	p1.price=10;
	System.out.println(p1);
}


}
