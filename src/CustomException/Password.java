package CustomException;

public class Password {
	
	static void password(String password) throws PasswordInvalidException {
		if(password.length()<8) {
			throw new PasswordInvalidException("Password is less than 8 characters");
		}
		System.out.println("Password is valid.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			password("vignesh");
		} catch (PasswordInvalidException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Password... Password should be atleast 8 characters");
			
		}
	}

}
