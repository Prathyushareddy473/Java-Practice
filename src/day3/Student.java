package day3;

public class Student {
	int id;
	String name;
	String course;
	 void display() {
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("course="+course);

	}
	public static void main(String args[]) {
		Student s=new Student();
		s.id=101;
		s.name="prathyu";
		s.course="eee";
	s.display();
	
		
		
	}
}



  



