package newpck;

public class Myemp {

	String company;
	String name;
	int sal;
	
	
	
	public  Myemp(String n, String c, int s){
		this.company=c;
		this.name=n;
		this.sal=s;
	}



	public Myemp() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Myemp [company=" + company + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
