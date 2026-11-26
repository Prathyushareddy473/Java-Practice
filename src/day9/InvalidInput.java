package day9;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InvalidInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter student marks");
			int marks=sc.nextInt();
			System.out.println("your marks ar"+marks);
		}catch(InputMismatchException e) {
			System.out.println("InnvalidInput|please enter numbers only");
			
		}
		sc.close();


	}

}
