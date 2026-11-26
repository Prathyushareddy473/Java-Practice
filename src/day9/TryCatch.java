package day9;

public class TryCatch {

	public static void main(String[] args) {
	int a=10;
	int b=0;
	try {
		int result=a/b;
		System.out.println("result"+result);
	}catch(ArithmeticException e) {
		System.out.println("cannot divided by zero");
		
	}
	System.out.println("program continues");

	}

}
