package CustomException;

public class PasswordInvalidException extends Exception{

	public PasswordInvalidException(String msg) {
		super(msg);
	}
}
