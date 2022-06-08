class addition
{
    addition(int a,int b)
    {
        int c = a+b;
        System.out.println("Sum of given 2 number is "+c);
    }
    addition(int x,int y,int z)
    {
        int c = x+y+z;
        System.out.println("Sum of given 3 number is "+c);
    }
}
public class new_constructor
{
    public static void main(String args[])
    {
        addition a1 = new addition(20,30);
        addition a2 = new addition(10,20,30);
    }
}