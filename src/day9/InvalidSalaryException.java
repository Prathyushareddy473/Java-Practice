package day9;

public class InvalidSalaryException extends Exception {
	InvalidSalaryException(String message){
		super(message);
	}

	
}
 class SalaryValidation{
	 static void checksalary(int salary)throws InvalidSalaryException{
		 if(salary<10000) {
			 throw new InvalidSalaryException("Salary must be 10000");
		 }else {
			 System.out.println("valid salary");
		 }
		 
	 }
	
	public static void main(String[] args) {
		try {
			checksalary(20000);
		}
		catch(InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
		
	}


	}


