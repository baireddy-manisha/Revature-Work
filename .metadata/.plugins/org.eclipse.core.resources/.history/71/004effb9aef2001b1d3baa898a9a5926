package day2task;
import java.util.Scanner;
public class Capitalize {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String arr[]=str.split(" ");
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			int l=arr[i].length();
			sb.append(arr[i].substring(0,l-1)).append(Character.toUpperCase(arr[i].charAt(l-1))).append(" ");	
		}
		System.out.println(sb.toString().trim());
	}

}

