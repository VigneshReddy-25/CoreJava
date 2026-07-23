package Encapsulation;

public class CityLibrary {
	private int bookId;
	private int overDueDate;
	
	public void setBookId(int bookId) {
		this.bookId=bookId;
	}
	public int getBookId() {
		return bookId;
	}
	
	public void setOverDue(int overDueDate) {
		this.overDueDate=overDueDate;
	}
	public int getOverDue() {
		return overDueDate;
	}
	
	public int fineByDays(int days) {
		return Math.min(days*5,1000);
	}
	
	public int fixedFines() {
		return 10;
	}
	
	public int fineByDaysPlusFixed(int days) {
		return Math.min(days*5+10,1000);
	}
	
	
}
