package day10;
import java.util.*;
import java.util.stream.*;

import day3.Employee;
class student{
	int id;
    String name;
	int marks;
	student( int id, String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}


		
	}


public class SortStudents {
public static void main(String[] args) {
		List<student>students=Arrays.asList(
				new student(1,"prathyu",80),
				new student(2,"hameeda",70),
				new student(3,"gangu",90),
				new student(4,"priya",69),
			      new  student(5,"surekha",10)
				);
		students.stream()
		.sorted(Comparator.comparingInt(e -> e.marks))
		.forEach(e ->System.out.println(
				e.id+" ="+e.name+"="+e.marks
				));
		
		
}
		

	}


