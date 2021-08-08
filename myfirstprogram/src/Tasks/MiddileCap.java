package Tasks;
import java.lang.Character.Subset;
import java.util.Scanner;
public class MiddileCap {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
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

