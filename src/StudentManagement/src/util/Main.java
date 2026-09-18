package util;

import model.Student;
import services.StudentService;

import java.util.Scanner;
public class Main {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		Scanner sc=new Scanner(System.in);
		StudentService service= new StudentService();
		while(true) {
			 System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
	         System.out.println("1. Add Student");
	         System.out.println("2. Display Students");
	         System.out.println("3. Search Student");
	         System.out.println("4. Delete Student");
	         System.out.println("5. Exit");

	         System.out.print("Enter your choice: ");
	         int choice = sc.nextInt();
	         switch(choice) {
	         	case 1:
	         		System.out.println("Enter Roll No: ");
	         		int rollno=sc.nextInt();
	         		sc.nextLine();
	         		System.out.println("Enter Student Name: ");
	         		String name=sc.nextLine(); 
	         		System.out.println("Enter your Age: ");
	         		int age=sc.nextInt();
	         		sc.nextLine();
	         		System.out.println("Enter your Course: ");
	         		String course=sc.nextLine();
	         		System.out.println("Enter Marks: ");
	         		int marks=sc.nextInt();
	         		Student student = new Student(rollno, name,age, course,marks);
	         		service.addStudent(student);
	         		break;
	         	case 2:
	         		service.viewStudents();
	         		break;
	         	case 3:
	         		System.out.println("Enter roll no: ");
	         		int rollno1=sc.nextInt();
	         		Student std= service.searchStudent(rollno1);
	         		System.out.println("Roll No: "+std.getRollNo());
	         		System.out.println("Student Name: "+std.getStudentName());
	         		System.out.println("Age: "+std.getAge());
	         		System.out.println("Course: "+std.getCourse());
	         		System.out.println("Marks: "+std.getMarks());
	         		break;
	         	case 4:
	         		System.out.println("Enter roll no: ");
	         		int rollno2=sc.nextInt();
	         		boolean delete=service.deleteStudent(rollno2);
	         		System.out.println((delete) ? "Student deleted successfully" : "Student not found");
	         		break;
	         	case 5:
	         		System.out.println("Thank you");
	         		return;
	         }
		}
	}

}
