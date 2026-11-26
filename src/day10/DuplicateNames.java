package day10;
import java.util.*;
import java.util.stream.*;

public class DuplicateNames {

	public static void main(String[] args) {
		List<String>names=Arrays.asList("prathyu","haneeda","gangu","priya","prathyu");
		Set<String> seen=new HashSet<>();
		System.out.println("duplicate names:");
		names.stream()
		     .filter(n ->!seen.add(n))
		     .distinct()
		     .forEach(System.out::println);
	
				
		

	}

}
