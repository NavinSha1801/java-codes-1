
public class Main
{	
	public static void main(String args[])
	{
		char a = (char)(Math.random()*(90-65+1)+65);
		char b = (char)(Math.random()*(90-65+1)+65);
		char c = (char)(Math.random()*(90-65+1)+65);
		int d = (int)(Math.random()*(10000-1000+1)+1000);
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);		
		System.out.print(" "+d);
	}
}