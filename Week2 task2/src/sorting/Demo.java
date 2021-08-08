package sorting;
	import java.util.Scanner;

	public class Demo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner (System.in);
			String s=sc.nextLine();
			String ar[]=s.split(" ");
			for(int i=0;i<ar.length;i++)
			{
				int t=0;
				for(int j=0;j<ar[i].length();j++)
				{	
					if(s.charAt(j)=='A'||s.charAt(j)=='E'||s.charAt(j)=='I'||s.charAt(j)=='O'
							||s.charAt(j)=='U'||s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
					{
						t=t+1;
					}
				}
				System.out.println("number of vowels:"+t);
			}

		}

	}

