package Tasks;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates {	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int j=0;
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			
			String arr[]=s.split(" ");
			String a[]=new String[arr.length];
			Arrays.sort(arr);
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i].equals(arr[i+1])) {
					continue;
					}
				else {
					a[j++]=arr[i];
				}
			}
			a[j]=arr[arr.length-1];
			for(int i=0;i<j+1;i++) {
				System.out.print(a[i]+" ");
			}
		}

	}


