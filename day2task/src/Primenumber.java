package day2task;
import java.util.Scanner;
public class Primenumber {
public static void main(String args[] )
{
	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elements of array");
	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		boolean isPrime=true;
		for(int k=2;k<arr[i];k++) {
			if(arr[i]%k==0)
			{
				isPrime=false;
				break;
			}
		}
	if(isPrime)
		System.out.print(arr[i]+" ");
	  
	}
}
}
				