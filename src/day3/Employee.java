package day3;

public class Employee {
	String name;
	int salary;
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("name="+name+" "+"salary="+salary);
	}
	

	public static void main(String[] args) {
		Employee e=new Employee("prathyu",70000);
		e.display();
		
		
		

	}

}
