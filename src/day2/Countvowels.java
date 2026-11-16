package day2;

public class Countvowels {

	public static void main(String[] args) {
	   String name="prathyu";
	   int vowelcount=0;
	   int consonentcount=0;
	   name.toLowerCase();
	   for(int i=0;i<=name.length()-1;i++) {
		   char ch=name.charAt(i);
		   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			   vowelcount++;
			   
		   }else {
			   consonentcount++;
		   }
	   }
	   System.out.println("Vowels: " + vowelcount);
       System.out.println("Consonants: " + consonentcount);
	   		

	}

}
