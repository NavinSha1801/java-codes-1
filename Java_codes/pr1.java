import java.util.Scanner;
class turninto
{
    public static void convert(float no)
    {
        double b = (double)no;
        System.out.println(no);
    }
}
class turnin
{
    public static void convert(double b)
    {
        String d = (String) b;
        System.out.println(d);
    }
}
public class pr1 {
    public static void main(String args[])
    {
        turninto t1 = new turninto();
        t1.convert(10.258);
        turnin t2 = new turnin();
        t2.convert(10.258);
    }
}
