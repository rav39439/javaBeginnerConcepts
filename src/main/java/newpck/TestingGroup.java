package newpck;

public class TestingGroup extends Student {

	
	void setname() {
		
		System.out.println(this.name);
	}
	
	void setdegree() {
		
		System.out.println(this.degree);
		
	}
	
	void setgroup() {
		
		System.out.println("Testing");
	}
	
	
	public static void main(String args[]) {
		
		TestingGroup t1=new TestingGroup();
		t1.name="Ravish kumar";
		t1.degree="MBA";
		
		System.out.println("The student name is"+"  "+t1.name);
		System.out.println("The degree of the student is"+"  "+t1.degree);
		t1.setgroup();

	}
}
