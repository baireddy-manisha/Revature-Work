package Tasks;
import java.util.Scanner;
public class Palindrome_Numbers {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
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

