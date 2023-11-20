package newpck;

public class Myemployee {

	String name;
	String company;
	int sal;
	
	Myemployee(String n,String c, int s){
		this.name=n;
		this.company=c;
		this.sal=s;
	}
	public static void main(String args[]) {
		Myemployee m=new Myemployee("tarun", "tcs",50000);
		Myemployee f=new Myemployee("Spandana", "IBM",80000);
		Myemployee g=new Myemployee("Ravish", "WIPRO",60000);
		Myemployee h=new Myemployee("Ashiwini", "CISCO",70000);

		Myemployee array[]= {m,f,g,h};
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println("name"+" "+array[i].name + " , "+"salary"+"  "+array[i].sal +" , "+"company"+" "+array[i].company);
			//System.out.println(array[i].sal);
			//System.out.println(array[i].company);


		}

		
		
	}
}
