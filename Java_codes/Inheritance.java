import java.util.Scanner;
class addition
{
	public static int sum(int a,int b)
	{
		int c = a+b;
		return c;
	}
}
class average extends addition
{
	public static int avg()
	{
		addition add = new addition();
		int d = add.sum(20,10);
		int ag = (int)d/2;
		System.out.print("Average of given number is ");
		return ag;
	}
}
public class Inheritance
{
	public static void main(String args[])
	{
		average a = new average();
		int f = average.avg();
		System.out.println(f);
	}
}
