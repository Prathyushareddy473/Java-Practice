package day9;

import java.io.FileWriter;
import java.io.IOException;


public class Day9 {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("my detail.txt");
			fw.write(" Student Name:Prathyu\n");
			fw.write("qualification:btech\n");
			fw.write("course:java full stack");
			fw.close();
			System.out.println("data saved succesfully");
			
			
			
			
		}catch(IOException e) {
			System.out.println("An error occured");
			
		}
		
	

	}

}
