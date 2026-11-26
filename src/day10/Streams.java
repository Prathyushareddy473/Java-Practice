package day10;
import java.util.*;
import java.util.stream.*;

public class Streams {

	public static void main(String[] args) {
		List<Integer>nums=Arrays.asList(1,3,4,8,9);
		System.out.println("even numbers:");
		nums.stream()
		    .filter(n ->n%2==0)
		    .forEach(System.out::println);
		System.out.println("odd numbers:");
		nums.stream()
		    .filter(n ->n%2!=0)
		    .forEach(System.out::println);
	

	

	}

}
