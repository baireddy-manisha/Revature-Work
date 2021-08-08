package day2task;
import java.util.Scanner;

public class Fldigits {
	public static void main(String[] args) {
		int j=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		String a[]=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			int k=arr[i].length();
			if(k==1) {
				continue;
			}
			String key=arr[i];
			if(key.charAt(0)!=(key.charAt(k-1))) {
				a[j++]=arr[i];
			}
		}
		for(int i=0;i<j;i++) {
			System.out.println(a[i]+" ");
		}
		
		
	}

}

