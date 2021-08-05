package exception;

public class Exception_validation {
     //case of unchecked exception for Aadhar Validation
	public boolean isValidAdhar(String adhar) {
		if(adhar.matches("[0-9]{12}"))
		{
			return true;
		}
		else {
			throw new InvalidAdharException("Entered"+adhar+"is not a valid one.Please enter a valid Adhar Number.");
	
		}
	}
	 //case of checked exception for password validation....
	public boolean isValidPassword(String password) throws InvalidPasswordException {
		int uppercase=0;
		int lowercase=0;
		int digit=0;
		
		int x=password.length();
		for(int i=0;i<x;i++) {
			char c=password.charAt(i);
			if(Character.isUpperCase(c))
			{
				uppercase++;
			}
			if(Character.isLowerCase(c))
			{
				lowercase++;
			}
			if(Character.isDigit(c))
			{
				digit++;
			}
		}
		if(uppercase>0 && lowercase>0 && digit>0)
		{
			System.out.println("SUCCESSFUL");
		}
		else {
			System.out.println("ENTER VALID PASSWORD");
			if(uppercase==0) {
				System.out.println("Make sure that the password must contain atleast one UpperCase..");
			}
			if(lowercase==0) {
				System.out.println("Make sure that the password must contain atleast one LowerCase..");
			}
			if(digit==0) {
				System.out.println("Make sure that the password must contain atleast one Digit..");
			}
		  
			}
		return true;
	}
}
