package day2task;
import java.lang.Character.Subset;
import java.util.Scanner;
public class Oddlength {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuffer sb=new StringBuffer();
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			int k=arr[i].length();
			if(k%2==0) {
				sb.append(Character.toUpperCase(arr[i].charAt(0)));
				sb.append(arr[i].substring(1)).append(" ");
			}
			else {
				int d=(k/2);
				sb.append(arr[i].substring(0,d));
				sb.append(Character.toUpperCase(arr[i].charAt(d)));
				sb.append(arr[i].substring(d+1)).append(" ");
			}
		}
		System.out.println(sb.toString());
		
	}

}

