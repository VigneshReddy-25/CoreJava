package methods;
import java.util.*;
public class StudentResults {
	static int[] marks = new int[5];
    static int total;
    static double average;
    static String grade;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentResults sr=new StudentResults();
		sr.acceptMarks();
		sr.calculateTotal(marks);
		sr.calculateAverage();
		sr.findGrade(average);
		sr.displayResult();
	}
	
	public void acceptMarks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 subject marks: ");
		for(int i=0;i<5;i++) {
			marks[i]=sc.nextInt();
		}
	}
	
	public void calculateTotal(int marks[]) {
		for(int num:marks) {
			total+=num;
		}
	}
	
	public void calculateAverage() {
		average=total/5;
	}
	
	public void findGrade(double average) {
		if(average>=90 && average<=100) grade="A+";
		else if(average>=80 && average<90) grade="A";
		else if(average>=70 && average<80) grade="B";
		else if(average>=60 && average<70) grade="C";
		else grade="Fail";
	}
	
	public void displayResult() {
		System.out.println("Total: "+total);
		System.out.println("Average: "+average);
		System.out.println("Grade: "+grade);
	}

}
