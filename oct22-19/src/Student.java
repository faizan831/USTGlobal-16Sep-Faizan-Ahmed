
public class Student {
	
	String name;
	String usn;
	int age;
	int phno;
	String gender;
	
	public Student(String name, String usn, int age, int phno, String gender) {
		this.name =  name;
		this.usn = usn;
		this.age = age;
		this.phno = phno;
		this.gender = gender;
		
	}
	void displayDetails() {
		System.out.println("name "+name +" usn "+usn+" age "+age+" phno "+phno+" gender "+gender);
		
	}
	public static void main(String[] args) {
		Student s1 = new Student("Faizan", "101", 21, 101, "male");
		s1.displayDetails();
		Student s2 = new Student("shareef","102", 001, 102, "male");
		s2.displayDetails();
		Student s3 = new Student("Rafeeq", "103", 23, 103, "male");
		s3.displayDetails();
		Student s4 = new Student("Ghazan","104", 22, 104, "male");
		s4.displayDetails();
		Student s5 = new Student("amit", "105", 21, 105, "male");
		s5.displayDetails();
		Student s6 = new Student("lochan","106", 22, 106, "male");
		s6.displayDetails();
		Student s7 = new Student("prakash", "107", 21, 107, "male");
		s7.displayDetails();
		Student s8 = new Student("asim","108", 22, 108, "male");
		s8.displayDetails();
		Student s9 = new Student("ruman", "109", 22, 109, "male");
		s9.displayDetails();
		Student s10 = new Student("harsha","110", 22, 110, "male");
		s10.displayDetails();
	}
}
