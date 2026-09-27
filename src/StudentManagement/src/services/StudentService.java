package services;

import java.util.ArrayList;
import java.util.Iterator;

import model.Student;
import Exceptions.NoStudents;
import Exceptions.StudentExist;

public class StudentService {

	ArrayList<Student> students=new ArrayList<>();
	public void addStudent(Student student) {

	    for (Student s : students) {

	        if (s.getRollNo() == student.getRollNo()) {
	            throw new StudentExist("Student with roll no "
	                    + student.getRollNo() + " already exists.");
	        }
	    }

	    students.add(student);

	    System.out.println("Student added successfully.");
	}
	
	public boolean deleteStudent(int rollno) {
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student s = iterator.next();
			if(s.getRollNo() == rollno) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}
	public void viewStudents() {
		if(students.isEmpty()) {
			throw new NoStudents("No students found...");
		}
		else {
			for(Student s: students) {
				System.out.println(s.toString());
			}
		}
		
	}
	public Student searchStudent(int rollno) {
		for(Student s: students) {
			if(s.getRollNo()== rollno) {
				return s;
			}
		}
		throw new NoStudents("No student found with roll no: " + rollno);
	}
	
	
}
