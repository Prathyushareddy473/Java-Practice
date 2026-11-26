package day10;
import java.util.*;
import java.util.stream.*;
class employes{
	int id;
	String name;
	int salary;
	employes(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class LowestPaid {

	public static void main(String[] args) {
		List<employes>e1= Arrays.asList(
				new employes(1,"prathyu",34000),
		new employes(1,"rathyu",74000),
		new employes(1,"athyu",14000),
		new employes(1,"thyu",4000));
		employes lowest=e1.stream()
	    .min(Comparator.comparingInt(e->e.salary))
	    .orElse(null);
		if(lowest!=null) {
			System.out.println("lowest paid="+lowest.name);
			System.out.println("lowest paid="+lowest.salary);
			
		}
	    
	    
		
	

	}

}
