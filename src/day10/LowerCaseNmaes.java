package day10;
import java.util.*;
import java.util.stream.*;

public class LowerCaseNmaes {

	public static void main(String[] args) {
		List<String>names=Arrays.asList("HAMEEDA","PRATHYU","GANGU");
		List<String>results=names.stream()
				.map(name->name.toLowerCase())
				.collect(Collectors.toList());
		System.out.println(results);
		
	

	}

}
