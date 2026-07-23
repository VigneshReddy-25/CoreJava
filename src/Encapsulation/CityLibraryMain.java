package Encapsulation;
import java.util.*;
public class CityLibraryMain {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		CityLibrary cl=new CityLibrary();
		int bookId=sc.nextInt();
		int overDueDate=sc.nextInt();
		int fineByDays=sc.nextInt();
		sc.nextInt();
		int fineByDaysPlusFixed=sc.nextInt();
		cl.setBookId(bookId);
		cl.setOverDue(overDueDate);
		
		System.out.println(cl.fineByDays(fineByDays));
		System.out.println(cl.fixedFines());
		System.out.println(cl.fineByDaysPlusFixed(fineByDaysPlusFixed));
		System.out.println(cl.getBookId());
		System.out.println(cl.getOverDue());
			
	}
}
