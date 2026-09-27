package model;

public class Student {

	private int rollno;
	private String studentName;
	private int age;
	private String course;
	private int marks;
	
	public Student(int rollno, String studentName, int age, String course,int marks) {
		this.rollno=rollno;
		this.studentName=studentName;
		this.age=age;
		this.course=course;
		this.marks=marks;
	}
	
	public int getRollNo() {
		return rollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getAge() {
		return age;
	}
	public String getCourse() {
		return course;
	}
	public int getMarks() {
		return marks;
	}
	
	public void setRollNo(int rollno) {
		this.rollno=rollno;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	
	
	@Override
	public String toString() {
		return "Roll No: "+ rollno
				+" Student Name: "+studentName
				+" Age:  "+age
				+" Course: "+course
				+" Marks: "+marks;
	}
}
