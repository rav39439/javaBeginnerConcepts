package newpck;

public class DeveloperGroup extends Student {

void setname() {
		
		System.out.println(this.name);
	}
	
	void setdegree() {
		
		System.out.println(this.degree);
		
	}
	
	void setgroup() {
		
		System.out.println("Development");
	}
	
	
	public static void main(String args[]) {
		
		DeveloperGroup t2=new DeveloperGroup();
		t2.name="Ravish kumar";
		t2.degree="MBA";
		
		System.out.println("The student name is"+"  "+t2.name);
		System.out.println("The degree of the student is"+"  "+t2.degree);
t2.setgroup();

	}
}
