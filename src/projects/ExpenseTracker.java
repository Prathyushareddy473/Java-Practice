package projects;
import java.util.ArrayList;

import java.util.Scanner;

import day9.ExepenceProject;

public class ExpenseTracker {








		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			ArrayList<ExepenceProject> expenses=new ArrayList<>();
			for(int i=1;i<=3;i++) {
			System.out.println("Enter exepence name:");
			String name=sc.nextLine();
			System.out.println("Enter amount:");
			double amount=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter category:");
			String category=sc.nextLine();
			ExepenceProject e=new ExepenceProject(name,amount,category);
			expenses.add(e);
			System.out.println("Expense added!");
			System.out.println("=====ALL EXPENSES");
		
				
			
			
		for(ExepenceProject a:expenses) {
			e.display();
			System.out.println("-------------");
		}

		}
		}
	


	

	}


