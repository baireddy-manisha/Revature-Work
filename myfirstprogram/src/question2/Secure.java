package question2;
import java.util.Scanner;
public class Secure {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.startsWith("https"))
		{
			System.out.println("secure");
		}
		else
		{
			System.out.println("not secure");
			sc.close();
		}
	}
	

}
