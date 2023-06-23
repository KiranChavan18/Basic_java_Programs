package basicPrograms;

public class Student {
	String name;
	int ID;

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 =new Student();
		s1.ID=1234;
		s1.name="kiran";
		s2.ID=5678;
		s2.name="ram";
		System.out.println(s1.name + " ID is " + s1.ID);
		System.out.println(s2.name + " ID is " + s2.ID);
	}

}
