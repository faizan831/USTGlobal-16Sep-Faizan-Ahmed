
public class Student {
	String name;
	int rollno;
	final String cname = "Qspiders";
	final int cid;
	
	public Student() {
		this.cid = 5;// TODO Auto-generated constructor stub
	}
	Student(String name, int rollno, int cid) {
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
	}
	final void printDetails() {
		System.out.println("Hi "+ name + " Welcome to " + cname);
	}
	final void printDetails(String name) {
		System.out.println("Hi "+ name + " Welcome to "+cname);
	}
}
