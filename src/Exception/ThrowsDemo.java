package Exception;

import java.io.*;

public class ThrowsDemo {

	static void toRead() throws FileNotFoundException {

			FileReader file=new FileReader("Student.txt");
		
	}
	
//	public static void main(String args[]) throws FileNotFoundException  {
//		toRead();
//		System.out.println("Execution completed");
//	}
	
	public static void main(String args[]) {
		try {
			toRead();
		}
		catch(Exception e) {
			System.out.println("File Not Found");
		}
		System.out.println("Execution completed");
	}
	
}
