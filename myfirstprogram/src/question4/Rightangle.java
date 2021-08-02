package question4;
import java.math.*;
import java.util.Scanner;
public class Rightangle {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double d=Math.pow(a,2)+Math.pow(b,2);
		double c=Math.sqrt(d);
		System.out.println(c);	
	}  


}
