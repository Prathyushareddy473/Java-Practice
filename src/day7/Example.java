package day7;
import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>();
		names.add("prathyu");
		names.add("priya");
		names.add("hameeda");
		names.add("gangu");
		System.out.println("names="+names);
		System.out.println("remove name="+names.remove("prathyu"));
		names.set(1,"surekha");
		System.out.println("update name="+names);
		System.out.println(names.contains("hameeda")); 
		System.out.println("names="+names);
		
		
		

	}

}
