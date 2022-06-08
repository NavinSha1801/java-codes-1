class display
{
	display(char a)
	{
		System.out.println(a);
	}
	display(char b,char c)
	{
		System.out.println(b + c);
	}
}
public class constructor
{
	public static void main(String args[])
	{
		display d1 = new display('h');
	}
}