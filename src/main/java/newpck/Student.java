package newpck;

public class Student {
String name;
static String institute="QSP";
@Override
public String toString() {
	return "Student [name=" + name +"  "+"  institute=" + institute + "]";
}
public static void main(String[] args) {
	Student s1=new Student();
	s1.name="anjali";
	Student s2=new Student();
	s2.name="Ravi";
	Student s3=new Student();
	s3.name="Harshita";
	
	Student s4=new Student();
	s4.name="Abhirami";
	System.out.println(s1);
	

	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);

}
}
