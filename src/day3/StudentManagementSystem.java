package day3;

import java.util.ArrayList;

public class StudentManagementSystem {



static class Student {

    private int id;
    private String name;
    private int age;
    private int marks;
    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

  
    public String calculateGrade() {

        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "Fail";
        }
    }
public void displayDetails() {

        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("----------------------");
    
}


}public class StudentManager{

	ArrayList<Student>students=new ArrayList<>();
	public void addStudent(Student s) {
		students.add(s);
		System.out.println("studens added succesfully");
	}
	public void displayStudents() {
		if(students.isEmpty()) {
			System.out.println("no students found");
			return;
		}
		for(Student s:students) {
			s.displayDetails();
			
		}
	}
		public void updateStudent(int id,String name,int age,int marks) {
			for(Student s:students) {
				if(s.getId()==id) {
					s.setName(name);
					s.setAge(age);
					s.setMarks(marks);
					System.out.println("student updated succesfully");
					return;
				}
			}System.out.println("student id not found");
		}
	}
 




	

}

