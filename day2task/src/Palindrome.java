package day2task;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			StringBuffer sb=new StringBuffer(arr[i]);
			if(sb.toString().equals(sb.reverse().toString())) {
				System.out.print(sb+" ");
			}
			
		}

	}

}
