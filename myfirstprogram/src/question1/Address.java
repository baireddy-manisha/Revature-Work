package question1;
import java.util.Scanner;
public class Address {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split("/");
		System.out.println(arr[2]);	
		sc.close();
	}
}
