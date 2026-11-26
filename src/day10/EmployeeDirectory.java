package day10;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
class employee{
	int id;
	String name;
	String department;
	double salary;   
	employee(int id,String name,String department,double salary){
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
		
	}
	void display() {
		System.out.println(id+"|"+name+"|"+department+"|"+salary);
	}
	
}

public class EmployeeDirectory {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<employee> e1=new ArrayList<>();
	while(true) {
		System.out.println("\n--- Employee Directory ---");
        System.out.println("1. Add Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Search Employee By ID");
        System.out.println("4. Filter By Department");
        System.out.println("5. Sort By Salary");
        System.out.println("6. Highest Paid Employee");
        System.out.println("7. Average Salary");
        System.out.println("8. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
        case 1:
        	System.out.println("Enter id:");
        	int id=sc.nextInt();
        	sc.nextLine();
        	System.out.println("enter name:");
        	String name=sc.nextLine();
   System.out.println("enter department:");
        	String department=sc.nextLine();
        	System.out.println("enter salary");
        	double salary=sc.nextDouble();
        	e1.add(
        			new employee(id,name,department,salary)
        			);
        	System.out.println("employee added successfully");
        	break;
        case 2:
        	e1.forEach(employee::display);
        	break;
        case 3:
        	System.out.println("enter employee id:");
        	int searchId=sc.nextInt();
        	e1.stream()
        	.filter(e->e.id==searchId)
        	.forEach(employee::display);
        	break;
        case 4:
        	sc.nextLine();
        	System.out.println("enter department");
        	String dept=sc.nextLine();
        	e1.stream()
        	.filter(e->e.department.equalsIgnoreCase(dept))
        	.forEach(employee::display);
        	break;
        case 5:
        	e1.stream()
        	.sorted(Comparator.comparingDouble(e->e.salary))
        	.forEach(employee::display);
        	break;
        case 6:
        	e1.stream()
        	.max(Comparator.comparingDouble(e->e.salary))
        	.ifPresent(employee::display);
        break;
        case 7:
        	double average=e1.stream()
        	    .mapToDouble(e->e.salary)
        	    .average()
        	     .orElse(0.0);
        	System.out.println("Avarage salary:"+average);
        	break;
        case 8:
        	System.out.println("THank you!");
        	sc.close();
        	return;
        	default:
        		System.out.println("invalid choice!");
        	
        	
        	
        	
        
        	
        	
        	
        
        
        }

	}
	

	}

}
