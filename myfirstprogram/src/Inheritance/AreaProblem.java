package Inheritance;

class Square {
	public int area(int x)
	{
		return x*x;
	}
}
class rectangle extends Square
{
	public int area(int x,int y)
	{
		return x*y;
	}
}
class trapezium extends rectangle
{
	public double area(int x,int y,int h)
	{
		return (double)((x+y)*h)/2;
	}

}
public class AreaProblem {
	public static void main(String[] args) {
		trapezium t=new trapezium();
		System.out.println(t.area(3));
		System.out.println(t.area(3,2));
		System.out.println(t.area(3,2,4));
		
	}

}
