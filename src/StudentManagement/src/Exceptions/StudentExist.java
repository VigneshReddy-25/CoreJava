package Exceptions;


public class StudentExist extends RuntimeException{

	public StudentExist(String message) {
		super(message);
	}
}
