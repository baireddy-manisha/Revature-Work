package exception;

public class Presenter {
	public static void main(String args[]) {
		System.out.println("Adhar Validation");
		Exception_validation x=new Exception_validation();
		try {
			if(x.isValidAdhar("934568934256"));{
			System.out.println("Successful");
			}
		}
		catch(InvalidAdharException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Password Validation");
		try
		{
			if(x.isValidPassword("HewUjhsd3I")) {
				System.out.println("Password Entered is Successful");
			}
		}
		catch(InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
